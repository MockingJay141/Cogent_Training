package com.innerClass;

/**
 * This is the class that shows the demo of the Method Local Inner class.
 * Method local Inner class is having a Inner class inside a Method of another class.
 *
 * In the example below we have class Inner1 class inside the test() of the Outer1 class.
 *
 * To access MethodLocalInnerClass we need to create the object of the Inner class inside the method that
 * the class is present in.
 * It is not possible to create the object of the class from outside the method.
 *
 */
class Outer1{
    void test(){
        System.out.println("Inside test()");
        class Inner1{
            void innerTest(){
                System.out.println("Inside innerTest()");
            }
        }

        Inner1 inner1 = new Inner1();
        inner1.innerTest();
    }
}
public class MethodLocalInnerClassDemo {

    public static void main(String[] args) {
        Outer1 o = new Outer1();
        o.test();
    }
}
