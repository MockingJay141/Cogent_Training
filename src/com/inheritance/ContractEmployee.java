package com.inheritance;

/**
 * This is the child class of the Parent class Employee
 * this denoted by the keyword "extends"
 */
public class ContractEmployee extends Employee {

    private int noOfHours;

    public ContractEmployee() {
    }

    public ContractEmployee(int noOfHours) {
        this.noOfHours = noOfHours;
    }

    public int getNoOfHours() {
        return noOfHours;
    }

    public void setNoOfHours(int noOfHours) {
        this.noOfHours = noOfHours;
    }
}
