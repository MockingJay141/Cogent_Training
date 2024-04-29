package com.inheritance;

public class A {

    A(){
        this(100);
        System.out.println("A Constructor");
    }

    A(int x) {
        System.out.println(x);
    }

    A(String x){
        //"this" keyword is used to call current class constructor
        // this process is called constructor chaining.
        this();
        System.out.println(x);
    }
}
