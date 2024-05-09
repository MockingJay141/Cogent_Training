package com.MethodReferences;

public class MethodReferenceDemo1 {

    public static void main(String[] args) {

        //Using forEach using lambda expression
        CustomerDB.getAllCustomer().stream().forEach(customer -> System.out.println(customer));

        System.out.println("=========================================================");

        //forEach using method reference
        CustomerDB.getAllCustomer().stream().forEach(System.out::println);

        System.out.println("==========================================================");

        //Using method reference to call a particular method of the class.
        MethodReferenceDemo1 mf = new MethodReferenceDemo1();
        // Here we are calling the display() method but when using method references we will never use parenthesis or pass
        //any parameters to the method call. This is one of the main differences between dot operator and "::" operator
        // Here we are calling the display method using class reference since the method is non-static.
        CustomerDB.getAllCustomer().stream().forEach(mf::display);

        System.out.println("============================================================");

        //Here we can call convert() method directly using class name since the method is static. hence, we don't need
        //to reference of the class.
        CustomerDB.getAllCustomer().stream().map(customer -> CustomerMapper.convert(customer)).forEach(System.out::println);

        System.out.println("============================================================");

        //We can use Method references to call convert methods as well
        CustomerDB.getAllCustomer().stream().map(CustomerMapper :: convert).forEach(System.out::println);


    }

    public void display(Customer customer){
        System.out.println(customer);
    }
}
