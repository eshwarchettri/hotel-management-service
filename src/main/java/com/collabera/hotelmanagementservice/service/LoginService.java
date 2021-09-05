package com.collabera.hotelmanagementservice.service;

import com.collabera.hotelmanagementservice.reponse.LoginResponse;
import com.collabera.hotelmanagementservice.sharedobject.EmployeeSharedObject;
import com.collabera.hotelmanagementservice.sharedobject.UserLoginSharedObject;

import java.util.List;


public interface  LoginService {
    LoginResponse isValueUser(UserLoginSharedObject userLoginSharedObject) throws Exception;




}
