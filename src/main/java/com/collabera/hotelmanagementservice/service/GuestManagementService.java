package com.collabera.hotelmanagementservice.service;

import com.collabera.hotelmanagementservice.sharedobject.GuestSharedObject;

import java.util.List;

public interface GuestManagementService {
    public List<GuestSharedObject> getGuestDetails();

}
