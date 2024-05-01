package com.collections;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2){
        String s1 = Integer.toString(o1.getSalary());
        String s2 = Integer.toString(o2.getSalary());
        return s1.compareTo(s2);
    }
}
