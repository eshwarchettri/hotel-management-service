package com.collabera.hotelmanagementservice.reponse;

import com.collabera.hotelmanagementservice.enumeration.Privilege;
import lombok.Data;

@Data
public class LoginResponse {
    private Long employeeId;
    private Privilege privilege;
}
