package com.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Tree set Properties:
 * 1. TreeSet doesn't allow duplicates
 * 2. TreeSet doesn't preserve order, It always sorted.
 * 3. TreeSet does not allow null insertion
 * 4. TreeSet is not Thread safe.
 * 5. Elements should always be Comparable or Comparator type.
 *
 * For an empty Tree null is allowed, but we cannot add any other element to the tree till we replace the null.
 *
 *
 */
public class TreeSetDemo {

    public static void main(String[] args) {
        Set<String> treeSet = new TreeSet<>();

        //String implements Comparable Interface
        treeSet.add("pqr");
        treeSet.add("abc");
        treeSet.add("def");
        // If we add null value to Tree Set we will ge NullPointerException
        //treeSet.add(null);

        // TreeSet will always be sorted.
        System.out.println(treeSet);


        /*
        When we add custom objects to the tree class then we have to add custom Comparator class to the set initialization.
        In this case we are passing "NameComparator()".

        If don't pass any Comparator class to custom object's TreeSet then we will get ClassCastException.
         */
        Set<Employee> employeeSet = new TreeSet<>(new NameComparator());

        employeeSet.add(new Employee(200, "Omkar", 1009, "TX"));
        employeeSet.add(new Employee(101, "Allen", 4009, "NY"));
        employeeSet.add(new Employee(102, "Black", 3009, "NJ"));

        System.out.println(employeeSet);
    }


}
