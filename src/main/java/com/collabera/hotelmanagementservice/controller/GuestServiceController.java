package com.collabera.hotelmanagementservice.controller;

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
    private GuestManagementService guestManagementService;

    @GetMapping("")
    public ResponseEntity<List<GuestSharedObject>> getAllGuests() {
        return ResponseEntity.ok(guestManagementService.getGuestDetails());
    }

    @PostMapping("/save-guest")
    public void saveGuest(@RequestBody GuestSharedObject guestSharedObject) {
        guestManagementService.saveGuest(guestSharedObject);
    }

    @DeleteMapping("/delete-guest/{id}")
    public void deleteGuest(@PathVariable("id") String id, @RequestParam(name = "reasonForDelete") String reasonForDelete ) {
        guestManagementService.deleteGuest(id, reasonForDelete);
    }

    @GetMapping("/{id}")
    public ResponseEntity<GuestSharedObject> getGuestDetail(@PathVariable("id") String id) {
        return ResponseEntity.ok(guestManagementService.getDetailById(id));
    }

}
