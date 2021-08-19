package com.collabera.hotelmanagementservice.sharedobject;

import lombok.Data;

import java.time.LocalDateTime;

@Data

public class GuestSharedObject {
    private String guestId;
    private String guestFirstName;
    private String guestLastName;
    private LocalDateTime checkinDateTime;
    private LocalDateTime checkoutDateTime;
    private RoomSharedObject room;
    private Boolean isDeleted=false;

}
