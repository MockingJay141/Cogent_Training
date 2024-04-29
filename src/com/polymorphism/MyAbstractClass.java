package com.polymorphism;

public abstract class MyAbstractClass {

    public MyAbstractClass(){

    }

    // All abstract methods need to defined with 'abstract' keyword
    // Default is access modifier, but we can change the access modifier when overriding the method.
    // We can increase the visibility of the method but not decrease.
    abstract void test();

    // This is called a concrete method
    void test2(){
        System.out.println("This method is not overridden");
    }

}

// interface -- All methods are public and abstract, Variables-- static and final
// Abstract -- methods are default and non-abstract, variable -- default, non-static and non-final
