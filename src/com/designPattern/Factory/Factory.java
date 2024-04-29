package com.designPattern.Factory;

/**
 * This is the class that hold the checks for all the different objects
 * This reduces the complexity of the code since we have all the object creation and checking if the objects exists
 * in one class.
 *
 * This is helpful with the creation of an interface and different overridden methods which get checked here before being
 * called in the main method.
 *
 * This is also called "loose Coupling".
 *
 * Factor design pattern provides an interface for creating objects in super class and allows subclasses to alter the type
 * of objects that will be created.
 */
public class Factory {

    public Employee getEmployee(String employee){
        if(employee == null){
            return null;
        }
        else if(employee.equalsIgnoreCase("software")){
            return new SoftwareEmployee();
        }
        else if(employee.equalsIgnoreCase("Permanent")){
            return new PermanentEmployee();
        }
        else if(employee.equalsIgnoreCase("Contract")){
            return new ContractEmployee();
        }
        else{
            return null;
        }
    }
}
