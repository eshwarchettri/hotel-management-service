package com.collabera.hotelmanagementservice.controller;

import com.collabera.hotelmanagementservice.sharedobject.LoginSuccessful;
import com.collabera.hotelmanagementservice.sharedobject.UserLoginSharedObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/authenticate")
public class LoginController {

    @PostMapping("/user-login")
    private ResponseEntity<Boolean> authenticateUser(@RequestBody UserLoginSharedObject loginSharedObject) throws Exception {

        if (loginSharedObject.getUserName().equalsIgnoreCase("admin")
                && loginSharedObject.getPassword().equalsIgnoreCase("password")) {

            return ResponseEntity.ok(Boolean.TRUE);
        } else {
            throw new Exception("Wrong username or password");
        }
    }
}
