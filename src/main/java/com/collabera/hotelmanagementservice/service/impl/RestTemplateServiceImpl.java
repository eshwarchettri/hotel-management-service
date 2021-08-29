package com.collabera.hotelmanagementservice.service.impl;

import com.collabera.hotelmanagementservice.config.RestResponsePage;
import com.collabera.hotelmanagementservice.service.RestTemplateService;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;

@Service
public class RestTemplateServiceImpl implements RestTemplateService {

    static RestTemplate restTemplate = new RestTemplate();

    @Override
    public <T> RestResponsePage<T> exchangeWithParameterizedTypeReference(String path, HttpMethod method,
                                                              ParameterizedTypeReference<RestResponsePage<T>> responseType, Object... uriVariables) {
        try {
            final ResponseEntity<RestResponsePage<T>> response = restTemplate.exchange(
                    path,
                    method,
                    null,
                    responseType, uriVariables);
            return response.getBody();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public <T> T exchange(String url, HttpMethod method, HttpEntity<?> requestEntity, Class<T> responseType, Object... variables) {
        try {
            return restTemplate.exchange(url, method, requestEntity, responseType, variables).getBody();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public <T> HttpEntity<T> entity(T body) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        return new HttpEntity<>(body, headers);
    }
}
