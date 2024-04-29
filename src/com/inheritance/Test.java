package com.inheritance;

/*
Java doesn't support multiple inheritance because every class has a default constructor and
child class always calls the parent class constructor hence the compiler doesn't know which
parent constructor to call this creates compile time ambiguity hence gives compile time error.


The only exception to this is using interfaces:
Since Interfaces doesn't have any constructors hence we can use Multiple Inheritance in this case.
 */
public class Test {

    public static void main(String[] args) {

        /*
        We Only Create the object of the child class
        Object of child class will be able to access all the attributes of Parent class
        Here "ContractEmployee" is the child class and "Employee" is the Parent class

         */
        ContractEmployee ce = new ContractEmployee();
        ce.setId(101);
        ce.setName("random1");
        ce.setAddress("TX");
        ce.setMobileNo("3692581471");
        ce.setNoOfHours(5);

        System.out.println("This is Contract employee info");
        System.out.println(ce.getId() + "," +
                            ce.getName() + "," +
                            ce.getAddress() + "," +
                            ce.getNoOfHours());

        RegularEmployee re = new RegularEmployee();
        re.setId(102);
        re.setName("random2");
        re.setAddress("TX");
        re.setMobileNo("3692581571");
        re.setMonthlySalary(5000.0);

        System.out.println("This is Regular employee info");
        System.out.println(re.getId() + "," +
                re.getName() + "," +
                re.getAddress() + "," +
                re.getMonthlySalary());
    }
}
