package com.demo.AOP.service;

import com.demo.AOP.annotation.CustomAnnotation;
import com.demo.AOP.model.Department;
import com.demo.AOP.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;

    public Department save(Department department){
        return departmentRepository.save(department);
    }

    @CustomAnnotation
    public Department findById(Integer id){
        return departmentRepository.findById(id).orElseThrow();
    }
}
