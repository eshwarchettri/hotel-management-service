package com.collabera.hotelmanagementservice.controller;

import com.collabera.hotelmanagementservice.service.LoginService;
import com.collabera.hotelmanagementservice.sharedobject.EmployeeSharedObject;
import com.collabera.hotelmanagementservice.sharedobject.UserLoginSharedObject;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/authenticate")
@AllArgsConstructor
public class LoginController {
    private final LoginService loginService;
    @PostMapping("/user-login")
    private ResponseEntity<Boolean> authenticateUser(@RequestBody UserLoginSharedObject loginSharedObject) throws Exception {


            return ResponseEntity.ok(loginService.isValueUser(loginSharedObject));

    }
@PostMapping("/save-employee")
    public void saveEmployee(@RequestBody EmployeeSharedObject employeeSharedObject){
        loginService.saveEmployee(employeeSharedObject);
}


}
