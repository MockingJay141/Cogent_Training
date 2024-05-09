package com.MethodReferences;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeTest {

    public static void main(String[] args) {

        List<Employee> employeeList = Arrays.asList(new Employee("Allen", 20, "HR", 2345),
                new Employee("Blake", 24, "IT", 6435),
                new Employee("James", 31, "IT", 7345),
                new Employee("Max", 25, "HR", 2966));

        /*
        Question: Return the employees with The Highest salaries in each department.
        Solution: We first convert the List of the given employee to Map since we need to keep track of two different
        values, after that we use groupingBy to group the employees by their Departments then we use collectingAndThen()
        from the Collectors interface to further sort employees and by using maxBy() we get the highest salary from each
        department.
         */
        Map<String, Employee> highestSalary =
                employeeList.stream().collect(Collectors.groupingBy(Employee::getDept,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(Employee::getSalary)), Optional::get)));

        System.out.println(highestSalary);
    }
}
