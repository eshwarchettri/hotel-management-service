package com.collabera.hotelmanagementservice.sharedobject;

import com.collabera.hotelmanagementservice.enumeration.Privilege;
import lombok.Data;

@Data
public class EmployeeSharedObject {


    private String employeeName;
    private String password;
    private Privilege privilege;
    private Long employeeId;
    private String phoneNumber;
    private String emailId;

}
