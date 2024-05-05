package com.stringHandling;

import java.util.Objects;

public class Employee {

    private String s;

    Employee(String s) {
        this.s = s;
    }

    public Employee() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(s, employee.s);
    }

    @Override
    public int hashCode() {
        return Objects.hash(s);
    }
}
