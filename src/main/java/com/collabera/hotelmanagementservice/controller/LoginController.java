package com.collabera.hotelmanagementservice.controller;

import com.collabera.hotelmanagementservice.reponse.LoginResponse;
import com.collabera.hotelmanagementservice.service.LoginService;
import com.collabera.hotelmanagementservice.sharedobject.EmployeeSharedObject;
import com.collabera.hotelmanagementservice.sharedobject.UserLoginSharedObject;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authenticate")
@AllArgsConstructor
public class LoginController {
    private final LoginService loginService;

    @PostMapping("/user-login")
    private ResponseEntity<LoginResponse> authenticateUser(@RequestBody UserLoginSharedObject loginSharedObject) throws Exception {

        return ResponseEntity.ok(loginService.isValueUser(loginSharedObject));

    }



}
