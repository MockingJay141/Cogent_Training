package com.demo.AOP.controller;


import com.demo.AOP.model.Employee;
import com.demo.AOP.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService EmployeeService;

    @PostMapping
    public Employee save(@RequestBody Employee Employee){
        return EmployeeService.save(Employee);
    }

    @GetMapping("/{id}")
    public Employee findById(@PathVariable(value = "id") Integer id){
        return EmployeeService.findById(id);
    }
}
