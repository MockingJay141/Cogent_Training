package com.reactiveProgramming;

import java.io.IOException;

/**
 * Using Reactive Programming to print all the elements in the Flux.
 */
public class Exercise2 {

    public static void main(String[] args) throws IOException {

        //Print all the numbers in the intNumberFlux
        ReactiveSources.intNumbersFlux().subscribe(System.out::println);

        //Print all the users in userFlux
        ReactiveSources.userFlux().subscribe(System.out::println);

        System.out.println("Press key to end");
        System.in.read();
    }
}
