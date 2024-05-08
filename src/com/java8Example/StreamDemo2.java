package com.java8Example;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamDemo2 {

    public static void main(String[] args) {

        List<Employee> employeeList = Arrays.asList(new Employee(101, "Omkar", "IT", 30000L, "TX"),
                                            new Employee(102, "Alex", "HR", 40000L, "NY"),
                                             new Employee(103, "Blake", "HR", 4000L, "NJ"),
                                             new Employee(104, "Max", "IT", 35000L, "TX"));

        List<Employee> sortedBySalary =
                employeeList.stream().sorted
                        ((obj1, obj2) -> obj1.getSalary().compareTo(obj2.getSalary())).collect(Collectors.toList());

        System.out.println(sortedBySalary);

        List<Employee> listOfAlex =
                employeeList.stream().filter(string -> string.getName().equals("Alex")).distinct().collect(Collectors.toList());
        Employee e = employeeList.stream().filter(string -> string.getName().equals("Alex")).findFirst().orElse(null);
        System.out.println(e.toString());

        System.out.println(listOfAlex);

        List<String> e1 = employeeList.stream().filter(sal -> sal.getSalary() > 20000L).
                map(emp -> emp.getName()).collect(Collectors.toList());
        System.out.println(e1);

        /*
        since we have to count the number of repeating characters we should always create a Map.
        Everytime we have count something we should Map data structure because key-value pairing makes it really easy to
        keep a track elements.
         */
        String input = "JavaJavaEE";
        Map<Character, Long> charCount = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(charCount);

        /*
        In this question we are trying to find the second-largest element in the given list. To do this we first use
        find all the distinct elements in the list after that we can sort the list in ascending or descending order
        which ever way is easier, then we use skip to jump to the required element and use findFirst to print output.
         */
        List<Integer> numbers = Arrays.asList(1, 3, 4, 5, 6, 7, 2, 9);
        int secondLargest =  numbers.stream().distinct().sorted().skip(numbers.size()-2).findFirst().orElse(null);
        System.out.println(secondLargest);


        /*
        In this question we are only printing the strings that occur more than once in the list. To do this as we saw
        in the previous question we will use HashMap to store the strings and their counts. After that we will use
        entrySet() to convert the Map to Set since map is not part of the collection framework we cannot directly use
        Stream API with maps hence we convert it to set and then use Stream to display the strings with count greater than 1.
         */
        List<String> lists = Arrays.asList("Apple", "Banana", "Apple", "Orange", "Banana", "Apple");
        Map<String, Long> count =  lists.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        List<String> duplicates = count.entrySet().
               stream().filter(entry -> entry.getValue() > 1).map(key -> key.getKey()).collect(Collectors.toList());
        System.out.println(duplicates);



    }
}
