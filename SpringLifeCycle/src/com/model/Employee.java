package com.model;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

// This is the annotation that is used to mark the class so that component-scan can create instance of this class
@Component
public class Employee {
    private Integer id;
    private String name;
    private String email;
    private Double salary;

    public Employee() {
    }

    public Employee(Integer id, String name, String email, Double salary) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                '}';
    }

    @PostConstruct
    public void init() {
        System.out.println("Customer Beam is going through init process");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Customer Beam is being destroyed");
    }
}
