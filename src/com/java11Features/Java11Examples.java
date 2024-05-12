package com.java11Features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Java11Examples {

    public static void main(String[] args) {

        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee(101, "Allen", 9876f));
        emp.add(new Employee(102, "Blake", 6789f));
        System.out.println(emp);

        System.out.println("==========================");

        // Using lambda expression to create a new array of employees
        Employee[] array = emp.toArray(size -> new Employee[size]);

        // Using Method references to create a new array of employees
        Employee[] array2 = emp.toArray(Employee[]::new);

        System.out.println(array[0]);

        var msg = 100.5;
        BiFunction<String, Integer, String> result = (var x, var y) -> "Hello" + "How";
        System.out.println(result.apply("10", 20));

    }
}
