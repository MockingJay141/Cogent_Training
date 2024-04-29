package com.demo;


class Test {
    public static void test(){
        System.out.println("Test class Test");
    }

}
public class MyClass {
    public static void test(){
        System.out.println("MyClass Test");
    }

    /**
     * JVM Only recognizes Main Method all other methods should be called inside the
     * main method.
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Main");
        // Call Test method inside main method.
        test();
        Test.test();
    }
}
// Default, Private, Protected, Public
// Private: Only in Class
// Default: Class and Package
// Protected: Class, Package and Outside Package with inheritance
// Public: Everywhere