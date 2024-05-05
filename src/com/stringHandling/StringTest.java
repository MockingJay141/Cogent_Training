package com.stringHandling;

public class StringTest {

    public static void main(String[] args) {

        String string1 = "Hello";// This called Literal declaration of String
        String string2 = "Hello";

        String string3 = new String("Hello");//
        String string4 = new String("Hello");

        System.out.println(string1 == string2);
        System.out.println(string3 == string4);

        System.out.println(string3.equals(string4));

        Employee e1 = new Employee("Hello");
        Employee e2 = new Employee("Hello");

        System.out.println(e1.equals(e2));


    }
}
