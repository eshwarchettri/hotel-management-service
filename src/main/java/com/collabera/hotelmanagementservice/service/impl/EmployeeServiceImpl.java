package com.collabera.hotelmanagementservice.service.impl;

import com.collabera.hotelmanagementservice.entityToSharedObjectTransformer.EmployeeSharedObjectTransformer;
import com.collabera.hotelmanagementservice.repositories.EmployeeRepository;
import com.collabera.hotelmanagementservice.service.EmployeeService;
import com.collabera.hotelmanagementservice.sharedObjectToEntityTranformer.EmployeeEntityTransformer;
import com.collabera.hotelmanagementservice.sharedobject.EmployeeSharedObject;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;
    private EmployeeEntityTransformer entityTransformer;
    private EmployeeSharedObjectTransformer employeeSharedObjectTransformer;

    @Override
    public void saveEmployee(EmployeeSharedObject employeeSharedObject) {
        employeeRepository.save(entityTransformer.transfer(employeeSharedObject));

    }

    @Override
    public List<EmployeeSharedObject> getEmployeeDetails() {
        return employeeRepository.findAllByIsDeletedFalse().stream().map(employeeSharedObjectTransformer::transfer).collect(Collectors.toList());
    }

    @Override
    public void updatePassword(EmployeeSharedObject employeeSharedObject, Long id) {
        employeeRepository.findById(id).ifPresent(employee -> {
            employee.setPassword(employeeSharedObject.getPassword());
            employeeRepository.save(employee);
        });
    }

}
