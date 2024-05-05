package com.innerClass;


class Outer2{
    static void test(){
        System.out.println("Outer class Static method");
    }

    static class InnerStatic{
        public static void test2(){
            System.out.println("Static Inner class method");
        }
    }
}
public class StaticNestedClassDemo {

    public static void main(String[] args) {


        Outer2.test();
        Outer2.InnerStatic.test2();
    }
}
