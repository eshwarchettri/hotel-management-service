package com.collabera.hotelmanagementservice.sharedobject;

import com.collabera.hotelmanagementservice.entities.Employee;
import com.collabera.hotelmanagementservice.enumeration.Privilege;
import lombok.Data;

@Data
public class UserLoginSharedObject {
    private String userName;
    private String password;



}
