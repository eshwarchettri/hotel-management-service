package com.collabera.hotelmanagementservice.service.impl;

import com.collabera.hotelmanagementservice.service.GuestManagementService;
import com.collabera.hotelmanagementservice.service.RestTemplateService;
import com.collabera.hotelmanagementservice.sharedobject.GuestSharedObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestManagementServiceImpl implements GuestManagementService {
    @Value("${guest.service.url}")
    private String guestServiceUrl;
    private final RestTemplateService restTemplateService;

    public GuestManagementServiceImpl(RestTemplateService restTemplateService) {
        this.restTemplateService = restTemplateService;
    }

    @Override
    public List<GuestSharedObject> getGuestDetails() {
        String url = guestServiceUrl + "guests";
        return restTemplateService.exchangeWithParameterizedTypeReference(url, HttpMethod.GET, new ParameterizedTypeReference<List<GuestSharedObject>>() {
        }, (Object) null);

    }

    @Override
    public void saveGuest(GuestSharedObject guestSharedObject) {


        String url = guestServiceUrl + "save-guest";
        restTemplateService.exchange(url, HttpMethod.POST, restTemplateService.entity(guestSharedObject),
                GuestSharedObject.class, (Object) null);
    }

    @Override
    public void deleteGuest(String id, String reasonForDelete) {
        String url = guestServiceUrl + "delete-guest/{id}?reasonForDelete={reasonForDelete}";
        restTemplateService.exchange(url, HttpMethod.DELETE, null,
                null, id, reasonForDelete);
    }

    @Override
    public GuestSharedObject getDetailById(String id) {
        String url = guestServiceUrl + "/guest/{id}";
        return restTemplateService.exchange(url, HttpMethod.GET, null, GuestSharedObject.class, id);
    }


}
