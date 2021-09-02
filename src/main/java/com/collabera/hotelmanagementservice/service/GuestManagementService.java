package com.collabera.hotelmanagementservice.service;

import com.collabera.hotelmanagementservice.config.RestResponsePage;
import com.collabera.hotelmanagementservice.sharedobject.GuestSharedObject;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface GuestManagementService {
     RestResponsePage<GuestSharedObject> getGuestDetails(Integer pageNo, Integer pageSize, String sortBy);
     void saveGuest(GuestSharedObject guestSharedObject);

     void deleteGuest(String id,String resonForDelete);

     GuestSharedObject getDetailById(String id);

     void guestCheckIn( String id);

}
