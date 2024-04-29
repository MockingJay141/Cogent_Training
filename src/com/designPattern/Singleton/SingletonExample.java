package com.designPattern.Singleton;

import com.inheritance.A;

class Address{

    // static variable to check if the object has been created
    static Address address;
    private int HouseNo;

    // Private constructor to make sure that object of singleton class 'Address' cannot be created outside of this class
    private Address() {

    }

    static Address getInstance(){
        //Condition to check if the object of Singleton class 'Address' already exists
        if (address == null) {
            address = new Address();
        }
        return address;
    }
}

public class SingletonExample {

    public static void main(String[] args) {

        // Testing if the class is singleton by trying to create multiple instances
        Address a = Address.getInstance();
        Address a1 = Address.getInstance();
        Address a2 = Address.getInstance();

        // All the instances or objects created should have same memory address
        System.out.println(a.hashCode());
        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());
    }


}

/*
Singleton is a design pattern that always has only one object
To create Singleton patterns following rules must be followed
1. Make Constructor private
2. Static method to create object inside the class and return it to the class
3. Add a condition inside the static method to check if the object already exists
4. Make the static method synchronized to make it thread safe.
 */
