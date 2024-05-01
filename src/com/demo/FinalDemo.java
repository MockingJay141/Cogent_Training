package com.demo;

/**
 * Since this class is final hence we cannot extend this class to any other class.
 */
final class A{}

class B{

    /**
     * Since this method is final hence this method cannot be overridden.
     */
    final public void test(){
        System.out.println("Final method");
    }
}

public class FinalDemo {

    /*
    'Final' keyword is an access modifier which can be used with class, methods, and variables
    Anything with final keyword cannot be re-initialized, that means its value cannot be changed

    if the method is final then that method cannot be overridden.
    if the class is final then we cannot inherit that class.
     */

    public static void main(String[] args) {
        final int x = 10;
    }
}
