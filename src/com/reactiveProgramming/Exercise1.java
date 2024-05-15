package com.reactiveProgramming;

/**
 * This is the class to show some examples using Streams will use the same examples with Reactive Programming as well.
 */
public class Exercise1 {

    public static void main(String[] args) {

        // Print all numbers in the intNumberStream
        StreamSource.intNumbersStream().forEach(System.out::println);
        System.out.println("================================================");

        //print numbers that are less than 5
        StreamSource.intNumbersStream().filter(number -> number < 5).forEach(System.out::println);
        System.out.println("================================================");

        //print second and third number that's greater than 5
        StreamSource.intNumbersStream().filter(number -> number > 5).skip(1).limit(2).forEach(System.out::println);
        System.out.println("================================================");

        //print first number greater than 5
        // if nothing is found print -1
        Integer value = StreamSource.intNumbersStream().filter(num -> num > 5).findFirst().orElse(-1);
        System.out.println(value);
        System.out.println("================================================");

        //print first names of all the users in UserStream
        StreamSource.userStream().map(User::getFirstName).forEach(System.out::println);
        System.out.println("================================================");

        //Print first name in userStream for users that have IDs from number stream
        StreamSource.intNumbersStream().flatMap(id -> StreamSource.userStream().filter(user -> user.getId() == id)).
                map(User::getFirstName).forEach(System.out::println);
    }
}
