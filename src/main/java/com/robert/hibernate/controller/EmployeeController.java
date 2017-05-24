package com.robert.hibernate.controller;

import com.robert.hibernate.enitites.Employee;
import com.robert.hibernate.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Robert.
 */
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @RequestMapping("/employee")
    public List<Employee> testIt() {

        return employeeRepository.findAll();
    }

    @RequestMapping("/employee/{employeeId}")
    public Employee getEmployee(@PathVariable Long employeeId) {

        return employeeRepository.findOne(employeeId);
    }

}
