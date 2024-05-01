package com.collections;

public class Employee {

    private Integer id;
    private String name;
    private int salary;
    private String address;

    public Employee() {
    }

    public Employee(Integer id, String name, int salary, String address) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.address = address;
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
