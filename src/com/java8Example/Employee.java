package com.java8Example;

public class Employee {

    private Integer id;
    private String name;
    private String dept;
    private Long salary;
    private String address;

    public Employee() {
    }

    public Employee(Integer id, String name, String dept, Long salary, String address) {
        this.id = id;
        this.name = name;
        this.dept = dept;
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

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary='" + salary + '\'' +
                ", address='" + address + '\'' +
                '}';
    }


}
