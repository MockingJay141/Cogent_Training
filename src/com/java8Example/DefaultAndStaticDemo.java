package com.java8Example;

@FunctionalInterface
interface A{
    void test();

    default void test1(){
        System.out.println("Default method");
    }

    static void test2(){
        System.out.println("static method");
    }

}

class B implements A{


    @Override
    public void test() {
        System.out.println("Overridden abstract method");
    }

    /*
    though it is not recommended we can override Default methods from interface.
    But it not possible to override static methods.

    STATIC METHODS CAN NEVER BE OVERRIDDEN.
     */
    @Override
    public void test1() {
        System.out.println("Overridden Default method");
    }
}


public class DefaultAndStaticDemo {


}
