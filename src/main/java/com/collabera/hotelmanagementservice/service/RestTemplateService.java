package com.collabera.hotelmanagementservice.service;

import com.collabera.hotelmanagementservice.config.RestResponsePage;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;

import java.util.List;

public interface RestTemplateService {

    <T> RestResponsePage<T> exchangeWithParameterizedTypeReference(final String path, final HttpMethod method,
                                                       ParameterizedTypeReference<RestResponsePage<T>> responseType,

                                                       Object... uriVariables);

    <T> T exchange(String url, HttpMethod method,
                   HttpEntity<?> requestEntity, Class<T> responseType, Object... variables);

    <T> HttpEntity<T> entity(T object);

}
