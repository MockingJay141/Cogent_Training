package com.example.BankingApplication.controller;

import com.example.BankingApplication.model.Employee;
import com.example.BankingApplication.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

// Here we are using REST controller this has "@ResponseBody" annotation by default which converts Java Object into
// JSON Object which is displayed on the web page.
@RestController
public class EmployeeController {

    // Here we are just creating instance of the interface and not the implementation class
    @Autowired
    EmployeeService employeeService;

    // This annotation is the actual end point where the values will be displayed
    @GetMapping("getData")
    public Employee test(){
        return new Employee(101, "Allen", "allen@gmail.com", 6000L);
    }

    // Same here we are using PostMapping annotation to send the data from database to webclient.
    // RequestBody is an annotation that is used to collect data from the Object and use it convert is to JSON format.0
    @PostMapping("save")
    public Employee save(@RequestBody Employee employee){

        if(employee != null) {
            Employee emp = employeeService.save(employee);
            System.out.println("Id: " + employee.getId() +
                    " Name: " + employee.getName() +
                    " Email: " + employee.getEmail() +
                    " Salary: " + employee.getSalary());
            return emp;
        }
        else
            return employee;
    }

    @PostMapping("getById")
    public Employee getById(@RequestBody Employee employee){

        if(employee != null) {
            Employee emp = employeeService.getById(employee);
            System.out.println("Got By ID");
            System.out.println("Id: " + employee.getId() +
                    " Name: " + employee.getName() +
                    " Email: " + employee.getEmail() +
                    " Salary: " + employee.getSalary());
            return emp;
        }
        else
            return employee;
    }

    @PostMapping("getAll")
    public List<Employee> getAll(@RequestBody Employee employee){

        List<Employee> emp = null;
        if(employee != null) {
             emp = employeeService.getAll(employee);
            System.out.println("Got All");
            for (Employee value : emp) {
                System.out.println(value);
            }
            return emp;
        }
        else
            return emp;
    }

    @PostMapping("delete")
    public boolean delete(@RequestBody Employee employee){

        boolean check = false;
        if(employee != null) {
            check = employeeService.delete(employee.getId());
            System.out.println("Employee Deleted: " + check);
            return !check;
        }
        else
            return check;
    }

    @PostMapping("update")
    public Employee update(@RequestBody Employee employee){

        if(employee != null) {
            Employee emp = employeeService.save(employee);
            System.out.println("Id: " + employee.getId() +
                    " Name: " + employee.getName() +
                    " Email: " + employee.getEmail() +
                    " Salary: " + employee.getSalary());
            return emp;
        }
        else
            return employee;
    }
}
