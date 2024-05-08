package com.java8Example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");



        // Here we are using .stream() method from collection interface to convert list to stream.
        Stream<String> s = strings.stream();

        s = s.filter(string -> !string.isEmpty());
        long count1 = s.count();


        System.out.println(count1);

        // Filter will take Predicate as parameter and return boolean value.
        long count = strings.stream().filter(string -> string.isEmpty()).count();
        System.out.println(count);

        // Map will take object as parameter and return any object type.
        List<String> msg = strings.stream().map(string -> "Hello " + string).collect(Collectors.toList());
        System.out.println(msg);

        List<Integer> integers = Arrays.asList(1, 2, 1, 13, 4, 15, 6, 17, 8, 19);

        //We can find the squares of every element of the list using the following method.
        // Here we are using .map and .distinct which are intermediate operations and .collect which is a terminal operation
        List<Integer> squares = integers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
        System.out.println(squares);

        // Example of forEach loop.
        integers.stream().map(i -> i * i).distinct().forEach((e) -> System.out.print(e + " "));
        System.out.println();

        IntSummaryStatistics stats = integers.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println("Max: " + stats.getMax());
        System.out.println("Average: " + stats.getAverage());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Count: " + stats.getCount());
    }
}
