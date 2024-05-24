package com.example.BankingApplication.service;

import com.example.BankingApplication.model.Employee;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeService {

    public Employee save(Employee employee);

    public Employee getById(Employee employee);

    public List<Employee> getAll(Employee employee);

    public boolean delete(Integer id);

    public Employee update(Employee employee);

}
