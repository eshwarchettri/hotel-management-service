package com.collabera.hotelmanagementservice.sharedObjectToEntityTranformer;


import com.collabera.hotelmanagementservice.entities.Employee;
import com.collabera.hotelmanagementservice.sharedobject.EmployeeSharedObject;
import com.collabera.hotelmanagementservice.sharedobject.UserLoginSharedObject;
import com.collabera.hotelmanagementservice.utility.EncryptionAndDecryption;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class EmployeeEntityTransformer {
    public Employee transfer(EmployeeSharedObject employeeSharedObject) {
         EncryptionAndDecryption encryptionAndDecryption =new EncryptionAndDecryption();
        employeeSharedObject.setPassword(encryptionAndDecryption.encrypt(employeeSharedObject.getPassword()));
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(employeeSharedObject, Employee.class);
    }
}
