package com.collabera.hotelmanagementservice.service;

import com.collabera.hotelmanagementservice.sharedobject.EmployeeSharedObject;

import java.util.List;

public interface EmployeeService {
    void saveEmployee(EmployeeSharedObject employeeSharedObject);

    List<EmployeeSharedObject> getEmployeeDetails();

    void updatePassword(EmployeeSharedObject employeeSharedObject, Long id);

}
