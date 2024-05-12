package com.designPattern.Singleton;

public class Test {

    public static void main(String[] args) {

        SingletonDemo s1 = SingletonDemo.getInstanceTS();

        SingletonDemo s2 = SingletonDemo.getInstance();

        s1.test();
        s2.test();
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
