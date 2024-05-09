package com.MethodReferences;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerDB {

    public static List<Customer> getAllCustomer() {
        return Stream.of(new Customer(101, "Allen", "Allen@gmail.com", Arrays.asList("9876542", "1245567")),
                new Customer(102, "Blake", "blake@gmail.com", Arrays.asList("93526362", "156324267")),
                new Customer(103, "James", "james@gmail.com", Arrays.asList("91552132", "8998137")),
                new Customer(104, "Max", "max@gmail.com", Arrays.asList("9476982", "5263567"))).
                collect(Collectors.toList());


    }
}
