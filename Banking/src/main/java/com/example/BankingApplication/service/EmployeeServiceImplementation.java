package com.example.BankingApplication.service;

import com.example.BankingApplication.model.Employee;
import com.example.BankingApplication.respository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImplementation implements EmployeeService{

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Employee save(Employee employee) {

        if (employee != null){
            employeeRepository.save(employee);
        }
        return employee;
    }

    @Override
    public Employee getById(Employee employee) {

        employeeRepository.getById(employee.getId());
        return employee;
    }

    @Override
    public List<Employee> getAll(Employee employee) {
        List<Employee> employeeList = employeeRepository.findAll();
        return employeeList;
    }

    @Override
    public boolean delete(Integer id) {
        employeeRepository.deleteById(id);
        boolean check = employeeRepository.existsById(id);
        return !check;
    }

    @Override
    public Employee update(@Param("employee") Employee employee) {


        if (employee != null){
            employeeRepository.save(employee);
        }
        return employee;
    }
}
