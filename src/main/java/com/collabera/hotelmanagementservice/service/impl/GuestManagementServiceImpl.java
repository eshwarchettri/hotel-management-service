package com.collabera.hotelmanagementservice.service.impl;

import com.collabera.hotelmanagementservice.service.GuestManagementService;
import com.collabera.hotelmanagementservice.service.RestTemplateService;
import com.collabera.hotelmanagementservice.sharedobject.GuestSharedObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestManagementServiceImpl implements GuestManagementService {
    @Value("${guest.service.url}")
    private String guestServiceUrl;
    private RestTemplateService restTemplateService;

    public GuestManagementServiceImpl(RestTemplateService restTemplateService) {
        this.restTemplateService = restTemplateService;
    }

    @Override
    public List<GuestSharedObject> getGuestDetails() {
        String url = guestServiceUrl + "guests";
        return  restTemplateService.exchangeWithParameterizedTypeReference(url, HttpMethod.GET, new ParameterizedTypeReference<List<GuestSharedObject>>() {
        }, null);

    }

}
