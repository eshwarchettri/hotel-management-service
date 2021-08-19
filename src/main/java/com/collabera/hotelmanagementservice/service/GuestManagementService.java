package com.collabera.hotelmanagementservice.service;

import com.collabera.hotelmanagementservice.sharedobject.GuestSharedObject;

import java.util.List;

public interface GuestManagementService {
     List<GuestSharedObject> getGuestDetails();
     void saveGuest(GuestSharedObject guestSharedObject);

     void deleteGuest(String id);
}
