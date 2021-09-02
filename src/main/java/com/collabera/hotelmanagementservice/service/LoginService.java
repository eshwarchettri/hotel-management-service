package com.collabera.hotelmanagementservice.service;

import com.collabera.hotelmanagementservice.sharedobject.EmployeeSharedObject;
import com.collabera.hotelmanagementservice.sharedobject.UserLoginSharedObject;
import org.springframework.stereotype.Service;


public interface  LoginService {
    Boolean isValueUser(UserLoginSharedObject userLoginSharedObject) throws Exception;


    void saveEmployee(EmployeeSharedObject employeeSharedObject);

}
