package com.polymorphism;

public interface MultipleInheritanceA {

    void calculate();

    default void test(){
        System.out.println("Interface A Test()");
    }
}
