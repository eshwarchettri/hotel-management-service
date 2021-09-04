package com.collabera.hotelmanagementservice.service.impl;

import com.collabera.hotelmanagementservice.entities.Employee;
import com.collabera.hotelmanagementservice.entityToSharedObjectTransformer.EmployeeSharedObjectTransformer;
import com.collabera.hotelmanagementservice.repositories.EmployeeRepository;
import com.collabera.hotelmanagementservice.service.LoginService;
import com.collabera.hotelmanagementservice.sharedObjectToEntityTranformer.EmployeeEntityTransformer;
import com.collabera.hotelmanagementservice.sharedobject.EmployeeSharedObject;
import com.collabera.hotelmanagementservice.sharedobject.UserLoginSharedObject;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class LoginServiceImpl implements LoginService {
    private EmployeeRepository employeeRepository;
    private EmployeeEntityTransformer entityTransformer;
    private EmployeeSharedObjectTransformer employeeSharedObjectTransformer;
    private UserLoginSharedObject userLoginSharedObject;


    @Override
    public Boolean isValueUser(UserLoginSharedObject userLoginSharedObject) throws Exception {
        Optional<Employee> employee = employeeRepository.findFirstByEmployeeNameIgnoreCaseAndEmployeePassword(userLoginSharedObject.getUserName(), userLoginSharedObject.getPassword());
        if (employee.isPresent()) {
            return true;
        } else {
            throw new Exception("Wrong username or password");
        }
    }




}
