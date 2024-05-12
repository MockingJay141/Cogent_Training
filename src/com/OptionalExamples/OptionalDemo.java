package com.OptionalExamples;

import java.util.Optional;

/**
 * Optional is class that is used to avoid NullPointerException
 * Methods of Optional class are:
 * 1) .of() : Call of this method can throw NullPointerException
 * 2) .ofNullable() : This is the method used when we expect there to be a null value.
 *
 */
public class OptionalDemo {

    public static void main(String[] args) {
        Optional<String> optional= Optional.of("Allen");
        Optional empty = Optional.empty();
        Optional<String> value = Optional.ofNullable("Blake");

        //Optional Class has a method get() that we will use when we only want value inserted in the Reference variable.
        System.out.println(value.get());

        String name = value.filter(x -> x.equals("Blake")).orElse("Name is not matching or Name is null");
        System.out.println(name);

        String upperCase = value.map(String::toUpperCase).orElse("value is null");
        System.out.println(upperCase);

        // isPresent() always returns boolean value
        if (value.isPresent()){
            System.out.println(value);
        }
        else {
            System.out.println("Value not present");
        }

        // ifPresent() always returns the values if it is present, or it will return NullPointerException
        value.ifPresent(System.out::println);


        Optional<String> gender = Optional.ofNullable("MALE");
        System.out.println(gender.orElseGet(() -> "<N/A>"));

    }
}
