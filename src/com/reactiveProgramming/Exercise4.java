package com.reactiveProgramming;

import java.io.IOException;

/**
 * Performing Filter, map, and various other operations on Flux. The Process is really similar to that of Streams
 */
public class Exercise4 {
    public static void main(String[] args) throws IOException {

        //Print all the numbers in the flux that are greater than 5

        ReactiveSources.intNumbersFlux().filter(e -> e > 5).log().subscribe(System.out::println);

        // Print 10* the value of all the elements that are greater than 5
        ReactiveSources.intNumbersFlux().filter(e -> e > 5).map(e -> e * 10).log().subscribe(System.out::println);

        //Print 10* the value of first three elements that are greater than 5
        ReactiveSources.intNumbersFlux().filter(e -> e > 5).map(e -> e * 10).take(3).log().subscribe(System.out::println);

        //Print all the values that are greater than 20 if none are found return -1
        ReactiveSources.intNumbersFlux().filter(e -> e > 20).log().defaultIfEmpty(-1).subscribe(System.out::println);

        // //Print first name in userStream for users that have IDs from number flux
        ReactiveSources.intNumbersFlux().flatMap(id -> ReactiveSources.userFlux().filter(user -> user.getId() == id)).
                distinct().log().subscribe(System.out::println);

        System.in.read();
    }
}
