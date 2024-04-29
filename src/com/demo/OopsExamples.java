package com.demo;

public class OopsExamples {

    public static void main(String[] args) {

        // To access any class we have to create an object of th class

        /*
        'new' keyword calls the Default constructor in the employee class
        constructor initializes all the attributes of the 'Employee' class.
        'e' is object of the 'Employee' class
         */
        //TODO Created more Methods in the Employee class and assign them values here
        Employee e = new Employee();
        e.setId(101);
        System.out.println(e.getId());

        Employee e1 = new Employee();
        e1.setId(102);
        System.out.println(e1.getId());

        // Properties of Constructor
        /*
        1. It is a special type of method which has same name as the class
        2. It does not have any return type.
        3. it is called by object itself
         */

    }


}
// Class is collection of Objects with similar characteristics
// OOP has 6 main concepts:
// 1. Class 2. Object 3. Encapsulation 4. Inheritance 5. Polymorphism 6. Abstraction
