package com.innerClass;

/**
 * This is the class that shows the Demo of NestedInnerClass.
 *
 * Nested Inner class is used to declare a class inside a class.
 * In this example class Inner class is inside the Outer class.
 *
 * To create the object of the Inner class we can do the following
 * Outer.Inner o = new Outer().new Inner().
 */
class Outer{
    private int x = 100;
    class Inner{
        void test(){
            System.out.println(x);
        }
    }
}
public class NestedInnerClassDemo {

    public static void main(String[] args) {
        Outer.Inner o = new Outer().new Inner();

        o.test();
    }
}
