package com.collabera.hotelmanagementservice.repositories;

import com.collabera.hotelmanagementservice.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee ,Long> {
    Optional<Employee> findFirstByEmployeeNameIgnoreCaseAndPassword(String employeeName, String employeePassword);

    List<Employee> findAllByIsDeletedFalse();

}
