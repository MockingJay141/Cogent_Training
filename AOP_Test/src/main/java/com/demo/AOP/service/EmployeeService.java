package com.demo.AOP.service;

import com.demo.AOP.model.Employee;
import com.demo.AOP.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public Employee save(Employee Employee){
        return employeeRepository.save(Employee);
    }

    public Employee findById(Integer id){
        return employeeRepository.findById(id).orElseThrow();
    }
}