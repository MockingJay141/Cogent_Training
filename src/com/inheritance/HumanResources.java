package com.inheritance;

/**
 * This is the child class of the Parent class Employee
 * this denoted by the keyword "extends"
 */
public class HumanResources extends Employee{

    private String manageResources;

    public HumanResources() {
    }

    public HumanResources(String manageResources){
        this.manageResources = manageResources;
    }

    public String getManageResources() {
        return manageResources;
    }

    public void setManageResources(String manageResources) {
        this.manageResources = manageResources;
    }
}
