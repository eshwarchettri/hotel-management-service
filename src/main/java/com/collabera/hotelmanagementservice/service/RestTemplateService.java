package com.collabera.hotelmanagementservice.service;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;

import java.util.List;

public interface RestTemplateService {

    <T> List<T> exchangeWithParameterizedTypeReference(final String path, final HttpMethod method,
                                                       ParameterizedTypeReference<List<T>> responseType,

                                                       Object... uriVariables);

}
