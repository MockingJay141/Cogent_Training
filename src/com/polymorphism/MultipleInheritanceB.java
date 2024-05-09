package com.polymorphism;

public interface MultipleInheritanceB {

    void calculate();

    default void test(){
        System.out.println("Interface B Test()");
    }
}
