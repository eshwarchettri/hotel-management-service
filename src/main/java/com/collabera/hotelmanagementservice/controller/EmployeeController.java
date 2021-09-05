package com.collabera.hotelmanagementservice.controller;

import com.collabera.hotelmanagementservice.service.EmployeeService;
import com.collabera.hotelmanagementservice.sharedobject.EmployeeSharedObject;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    @PostMapping("/create-employee")
    public void saveEmployee(@RequestBody EmployeeSharedObject employeeSharedObject) {
        employeeService.saveEmployee(employeeSharedObject);
    }

    @GetMapping("")
    public ResponseEntity<List<EmployeeSharedObject>> getEmployeeDetails() {
        return new ResponseEntity<>(employeeService.getEmployeeDetails(), HttpStatus.OK);

    }

    @PutMapping("/update-password/{id}")
    public void updatePassword(@RequestBody EmployeeSharedObject employeeSharedObject,@PathVariable("id") Long id) {
         employeeService.updatePassword(employeeSharedObject, id);
    }

    @DeleteMapping("/delete-employee/{id}")
    public void deleteEmployee(@PathVariable("id") Long employeeId) {
        employeeService.deleteEmployee(employeeId);
    }
}
