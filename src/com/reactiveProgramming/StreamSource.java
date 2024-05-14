package com.reactiveProgramming;

import java.util.stream.Stream;

public class StreamSource {

    public static Stream<String> stringNumbersStream() {
        return Stream.of("one", "two", "Three", "four", "five", "six", "Seven", "eight", "nine", "ten");

    }

    public static Stream<Integer> intNumbersStream() {
        return Stream.iterate(0, i-> i+2).limit(10);
    }

    public static Stream<User> userStream() {
        return Stream.of(new User(1, "Lionel", "Messi"),
                new User(2, "Cristiano", "Ronaldo"),
                new User(3, "Diego", "Maradona"),
                new User(4, "Zinedine", "Zidane"),
                new User(5, "Gareth", "Bale"),
                new User(1, "Jorgen", "Klinsmann"));
    }
}
