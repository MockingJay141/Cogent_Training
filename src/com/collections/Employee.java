package com.collections;

import java.util.Objects;

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

    /**
     * This method is overridden from object class to ensure that objects with same hash values return true when equals()
     * method is called.
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary && id.equals(employee.id) && name.equals(employee.name) && address.equals(employee.address);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", address='" + address + '\'' +
                '}';
    }

    /**
     * This method is overridden from the object class to make sure same objects have same hash value.
     * @return
     */
    @Override
    public int hashCode() {
        return Objects.hash(id, name, salary, address);
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
