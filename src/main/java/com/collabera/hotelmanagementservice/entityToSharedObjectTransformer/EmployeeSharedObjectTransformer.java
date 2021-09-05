package com.collabera.hotelmanagementservice.entityToSharedObjectTransformer;

import com.collabera.hotelmanagementservice.entities.Employee;
import com.collabera.hotelmanagementservice.sharedobject.EmployeeSharedObject;
import com.collabera.hotelmanagementservice.sharedobject.UserLoginSharedObject;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class EmployeeSharedObjectTransformer {
    public EmployeeSharedObject transfer(Employee employee){

        ModelMapper modelMapper=new ModelMapper();
        return  modelMapper.map(employee,EmployeeSharedObject.class);
    }
}
