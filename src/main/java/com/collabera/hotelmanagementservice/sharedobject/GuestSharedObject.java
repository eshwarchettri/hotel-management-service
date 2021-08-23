package com.collabera.hotelmanagementservice.sharedobject;

import com.collabera.hotelmanagementservice.enumeration.RoomPreferencesEnum;
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
    private Boolean isDeleted = false;
    private Long zipCode;
    private String firstAddress;
    private RoomPreferencesEnum roomPreferences;
    private String secondAddress;
    private String city;
    private String phone;
    private String specialInstruction;
    private String email;
    private Integer adults;
    private String state;
    private Integer children;


}
