package com.java8Example;

import java.util.function.*;

/**
 * New Feature of Java 8 are:
 * 1. Functional Interface
 * 2. Default and static method in Interface
 * 3. Streams
 * 4. Date and Time API
 *
 *
 * Functional Interface:
 *      It is an interface which will only have one abstract method and more than one default and static method.
 *      abstract methods are always public.
 *
 *      Another way of overriding an abstract method is Lambda expression
 *      Lambda expressions can only be used with functional interfaces as it can only override one method.
 *      Lambda expression is an implementation of functional interfaces.
 *
 *
 */

@FunctionalInterface
interface MyI{
    void test();
}

public class Test {
    public static void main(String[] args) {

        /*
        This is an example of to write lambda expression is Java 8,
        Here we can see that since we are not defining which method to override hence
        the Interface cannot have more than one abstract methods as it will be ambiguous to the JVM.

        Java has few predefined functional interfaces
        1. Function
        2. Predicate
        3. BiFunction
         */
        MyI a = () -> {
            System.out.println("Line 1");
            System.out.println("Line 2");
            System.out.println("Use curly braces for multiple lines of execution");
        };

        MyI b = () -> System.out.println("Test2");

        a.test();
        b.test();


        //This is an example to show how to use the pre-defined functional interface.
        Function<String, String> f1 =  (str) -> str + " Fine";
        f1.apply("Hello");

        BiFunction<String, Integer, String> biF = (a1, b1) -> a1 + b1;
        System.out.println(biF.apply("Welcome", 10));

        Predicate<String> p = (a11) -> {
            if (a11.length() == 4){
                return true;
            }
            else
                return false;
        };

        System.out.println(p.test("Omkar"));

        Consumer<String> consumer = (str) -> System.out.println("Its Consumer");
        consumer.accept("Hello");

        Supplier<Integer> supplier = () -> 10;

        System.out.println(supplier.get());

    }
}
