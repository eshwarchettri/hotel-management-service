package com.collabera.hotelmanagementservice.controller;

import com.collabera.hotelmanagementservice.config.RestResponsePage;
import com.collabera.hotelmanagementservice.service.GuestManagementService;
import com.collabera.hotelmanagementservice.sharedobject.GuestSharedObject;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/guests")
@AllArgsConstructor
public class GuestServiceController {
    private final GuestManagementService guestManagementService;

    @GetMapping("")
    public ResponseEntity<RestResponsePage<GuestSharedObject>> getAllGuests(@RequestParam(name = "page", defaultValue = "0") Integer pageNo,
                                                                            @RequestParam(name = "size", defaultValue = "10") Integer pageSize,
                                                                            @RequestParam(name = "sort", defaultValue = "guestLastName") String sortBy) {
        return ResponseEntity.ok(guestManagementService.getGuestDetails( pageNo, pageSize, sortBy));
    }

    @PostMapping("/save-guest")
    public void saveGuest(@RequestBody GuestSharedObject guestSharedObject) {
        guestManagementService.saveGuest(guestSharedObject);
    }

    @DeleteMapping("/delete-guest/{id}")
    public void deleteGuest(@PathVariable("id") String id, @RequestParam(name = "reasonForDelete", required = false) String reasonForDelete ) {
        guestManagementService.deleteGuest(id, reasonForDelete);
    }

    @GetMapping("/{id}")
    public ResponseEntity<GuestSharedObject> getGuestDetail(@PathVariable("id") String id) {
        return ResponseEntity.ok(guestManagementService.getDetailById(id));
    }
    @PutMapping("/guest-checkin/{id}")
    public void guestCheckIn(@PathVariable("id")String id){
        guestManagementService.guestCheckIn( id);
    }

}
