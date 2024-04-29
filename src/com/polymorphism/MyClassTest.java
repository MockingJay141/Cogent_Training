package com.polymorphism;

public class MyClassTest {

    public static void main(String[] args) {
        MyClass mc = new MyClass();

        mc.test();// this is the overridden method
        mc.test2();// this method is not overridden
    }
}
