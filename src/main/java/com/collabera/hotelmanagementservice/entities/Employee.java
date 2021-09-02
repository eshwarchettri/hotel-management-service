package com.collabera.hotelmanagementservice.entities;

import com.collabera.hotelmanagementservice.enumeration.Privilege;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "EMPLOYEE_DETAILS")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EMPLOYEE_ID")
    private Long employeeId;

    @Column(name = "EMPLOYEE_NAME")
    private String employeeName;

    @Column(name = "EMPLOYEE_PASSWORD")
    private String employeePassword;

    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

    @Column(name="EMAIL_ID")
    private String emailId;

    @Column(name = "PRIVILEGE_TYPE")
    @Enumerated(EnumType.STRING)
    private Privilege privilege;
}
