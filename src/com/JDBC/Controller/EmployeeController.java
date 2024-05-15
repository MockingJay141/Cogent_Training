package com.JDBC.Controller;

import com.JDBC.Model.Employee;
import com.JDBC.Repository.DBRepository;
import com.JDBC.Service.EmployeeService;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

public class EmployeeController {

    public static void main(String[] args) throws SQLException {

        EmployeeService employeeService = new EmployeeService();
        List<Employee> employeeList = employeeService.fetchAll();

        Iterator<Employee> iterator = employeeList.iterator();

        while (iterator.hasNext()){
            Employee e = (Employee) iterator.next();
            System.out.println("Id: " + e.getId() +
                    ", Name: " + e.getName() +
                    ", Email: " + e.getEmail() +
                    ", Salary: " + e.getSalary());
        }

        DBRepository.closeConnection();
    }
}
