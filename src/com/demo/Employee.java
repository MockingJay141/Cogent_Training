package com.demo;

public class Employee {

    /*
   These are the global variables that have default values for the propeties of class 'Employee'
   Their values can be returned using getter methods.
   Their values can be changed using setter methods.
    */
    private int id;
    private String name;
    private String address;
    private String mobileNo;

    /*
    Designing a Constructor here
    Once we create a parameterized constructor Default constructor will not exist anymore.
    we will have to create a default constructor

    Whenever we have more than one constructor in a class it's called constructor overloading.
     */

    /**
     * This is type of non parameterized constructor
     * This acts as a Default constructor
     */
    public Employee(){
        super();// 'super' keyword is used to reference the super class that has preference above this method
    }

    /**
     * This is type of parameterized constructor
     * @param id
     * @param name
     * @param address
     * @param mobileNo
     */
    public Employee(int id, String name, String address, String mobileNo){
        this.id = id;
        this.name = name;
        this.address = address;
        this.mobileNo = mobileNo;

    }

    // There are usually two main methods getters and setters

    public void setId(int id) {

        this.id = id; // 'this' key word is used here to get the value from parameter on line 21 and assign it to global
        // variable on line 14
        // Setter methods are always 'void' and don't return any values

    }

    public int getId() {
        return id;

        //this is a getter method, and it always returns the value assigned to global variable
    }
}
