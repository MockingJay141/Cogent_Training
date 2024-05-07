package com.java8Example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");



        Stream<String> s = strings.stream();

        s = s.filter(string -> !string.isEmpty());
        long count1 = s.count();

        System.out.println(count1);

        long count = strings.stream().filter(string -> string.isEmpty()).count();
        System.out.println(count);

        List<String> msg = strings.stream().map(string -> "Hello " + string).collect(Collectors.toList());
        System.out.println(msg);
    }
}
