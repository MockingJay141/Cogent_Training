package com.java8Example;

import java.util.List;
import java.util.stream.Collectors;

public class NestedListDemo {

    public static void main(String[] args) {

        List<Customer> customerList = CustomerDB.getAllCustomer();

        // By using normal map method we are only able to return Nested List of mobile numbers since map return type is
        // stream
        List<List<String>> mobileNo = customerList.stream().map(c -> c.getMobileNo()).collect(Collectors.toList());
        System.out.println(mobileNo);

        // Here we are using flatMap, By using flatMap we are just able to return a single list of Mobile numbers.
        // instead of a nested list.
        // after getting the mobile numbers we are again converting it to stream and then using collect() to return the list.
        List<String> numbers = customerList.stream().flatMap(customer -> customer.getMobileNo().stream())
                .collect(Collectors.toList());
        System.out.println(numbers);
    }
}
