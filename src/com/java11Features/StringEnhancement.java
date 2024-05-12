package com.java11Features;

import java.util.List;
import java.util.stream.Collectors;

public class StringEnhancement {

    public static void main(String[] args) {

        String str = "Wel\rcome";
        String str1 = "Hel\nlo";
        List<String> result1 = str1.lines().collect(Collectors.toList());
        List<String> result2 = str.lines().collect(Collectors.toList());

        System.out.println(result1);
        System.out.println(result2);

        String name = "               Omkar         ";
        System.out.println(name.stripLeading());
        System.out.println(name.stripTrailing());
        System.out.println(name.strip());

    }
}
