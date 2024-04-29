package com.inheritance;

/**
 * This is the child class of the Parent class Employee
 * this denoted by the keyword "extends"
 */
public class RegularEmployee extends Employee{

    private double monthlySalary;

    public RegularEmployee() {
    }

    public RegularEmployee(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
}
