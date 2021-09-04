package com.collabera.hotelmanagementservice.controller;

import com.collabera.hotelmanagementservice.service.EmployeeService;
import com.collabera.hotelmanagementservice.sharedobject.EmployeeSharedObject;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class EmployeeController {
    private EmployeeService employeeService;

    @PostMapping("/save-employee")
    public void saveEmployee(@RequestBody EmployeeSharedObject employeeSharedObject) {
        employeeService.saveEmployee(employeeSharedObject);
    }

    @GetMapping("/employee-details")
    public List<EmployeeSharedObject> getEmployeeDetails() {
        return employeeService.getEmployeeDetails();

    }

    @PutMapping("/update-password/{id}")
    public void updatePassword(EmployeeSharedObject employeeSharedObject,@PathVariable("id") Long id) {
         employeeService.updatePassword(employeeSharedObject, id);
    }
}
