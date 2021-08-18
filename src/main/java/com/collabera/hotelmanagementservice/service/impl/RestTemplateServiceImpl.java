package com.collabera.hotelmanagementservice.service.impl;

import com.collabera.hotelmanagementservice.service.RestTemplateService;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class RestTemplateServiceImpl implements RestTemplateService {

    static RestTemplate restTemplate = new RestTemplate();

    @Override
    public <T> List<T> exchangeWithParameterizedTypeReference(String path, HttpMethod method,
                                                              ParameterizedTypeReference<List<T>> responseType, Object... uriVariables) {
        final ResponseEntity<List<T>> response = restTemplate.exchange(
                path,
                method,
                null,
                responseType, uriVariables);
        return response.getBody();
    }


}
