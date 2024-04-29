package com.polymorphism;

public class PolyTest {

    /**
     * Here we can see that all three methods have same name
     * But all the methods have different arguments hence the compiler can differentiate between the methods
     * this is an example of Overloading Polymorphism.
     */

    void test(){
        System.out.println("test 1");
    }

    void test(int x){
        System.out.println(x);
    }

    int test(String msg){
        System.out.println(msg);
        return 100;
    }

    public static void main(String[] args) {
        PolyTest p = new PolyTest();
        p.test();
        p.test(10);
        p.test("hello");
    }
}

// Polymorphism is a form of multi form
/*
There are two types of polymorphism
1. Overloading (Compile time)
2. Overriding ( Run time)
---------------------------
Rules of Overloading
1. Overloading always will create in a single class
2. Multiple method will have the same body but different same method name. Since this could create issues during compile time
   we need to have different arguments to different methods.

There are two types of Overloading
1. Method Overloading
2. Constructor Overloading
 */
