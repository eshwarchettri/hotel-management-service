package com.collabera.hotelmanagementservice.service.impl;

import com.collabera.hotelmanagementservice.entities.Employee;
import com.collabera.hotelmanagementservice.reponse.LoginResponse;
import com.collabera.hotelmanagementservice.repositories.EmployeeRepository;
import com.collabera.hotelmanagementservice.service.LoginService;
import com.collabera.hotelmanagementservice.sharedobject.UserLoginSharedObject;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class LoginServiceImpl implements LoginService {
    private final EmployeeRepository employeeRepository;


    @Override
    public LoginResponse isValueUser(UserLoginSharedObject userLoginSharedObject) throws Exception {
        Optional<Employee> employee = employeeRepository.findFirstByEmployeeNameIgnoreCaseAndPassword(userLoginSharedObject.getUserName(), userLoginSharedObject.getPassword());
        if (employee.isPresent()) {
           return new LoginResponse() {{
                setPrivilege(employee.get().getPrivilege());
                setEmployeeId(employee.get().getEmployeeId());
            }};

        } else {
            throw new Exception("Wrong username or password");
        }
    }




}
