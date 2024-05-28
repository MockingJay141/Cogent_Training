package com.demo.AOP.controller;

import com.demo.AOP.model.Department;
import com.demo.AOP.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @PostMapping("save")
    public Department save(@RequestBody Department department){
        return departmentService.save(department);
    }

    @GetMapping("/{id}")
    public Department findById(@PathVariable(value = "id") Integer id){
        return departmentService.findById(id);
    }

}
