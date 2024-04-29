package com.polymorphism;

class Animal{
    void eat(){
        System.out.println("Animal Eat method");
    }

    void run(){

    }
}

class Cat extends Animal{
    @Override
    void eat(){
        System.out.println("Cat Eat method");
    }
}

public class PolyTest1 {
    public static void main(String[] args) {

        Animal a = new Cat(); // Overriding;
        // Object 'a' can only access the overridden methods and not other methods of Class "Cat".
        // Parent reference will hold child object.


        Cat c = new Cat(); // Inheritance
        // Object 'c' can access all the methods of Class "Cat" whether they are overridden or not.
        // child reference will hold child object.

    }
}

/*
Rules of Overriding
1. It will happen in multiple classes which are connected by rules of inheritance.
2. Method Signature( return type, name, arguments) should be the same. Access modifier can be different.
3. Constructor cannot be overridden.
4. Static method cannot be overridden.
 */
