package com.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer {

    private Integer id;
    private String name;
    //Since Address is not a primary dependency, and it is a Secondary dependency therefore we need to make it
    //Autowired
    @Autowired
    private Address address;
    private Integer age;

    public Customer() {
    }

    public Customer(Integer id, String name, Address address, Integer age) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", age=" + age +
                '}';
    }
}
