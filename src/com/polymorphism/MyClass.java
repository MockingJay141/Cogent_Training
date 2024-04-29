package com.polymorphism;

public class MyClass extends MyAbstractClass{

    // Only the abstract methods are implemented from the abstract class
    // Concrete methods are not implemented
    @Override
    void test() {

        System.out.println("This method is overridden in MyClass");

    }
}
