package com.test;

import com.model.Address;
import com.model.Customer;
import com.model.Employee;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {

    public static void main(String[] args) {

        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("Bean.xml");
        Employee employee = ctx.getBean(Employee.class);

        //Since we are using Component-scan annotation therefore we have to use Setter methods here
        employee.setId(101);
        employee.setName("Omkar");
        employee.setEmail("omkar@gmail.com");
        employee.setSalary(5000.6);

        System.out.println(employee.getId() + ", " +
                employee.getName() + ", " +
                employee.getEmail() + ", " +
                employee.getSalary());

        Customer customer = ctx.getBean(Customer.class);
        Address address = customer.getAddress();
        customer.setId(101);
        customer.setName("Omkar");
        customer.setAge(25);
        address.setId(1);
        address.setStreet("ABC");
        address.setState("TX");
        address.setCountry("US");
        address.setZipcode(12345);

        System.out.println("Customer Details");
        System.out.println(customer.getId() + ", " +
                customer.getName() + ", " +
                customer.getAge() + "," +
                customer.getAddress());

        System.out.println("Address Details");
        System.out.println(address.getId() + ", " +
                address.getStreet() + ", " +
                address.getState() + ", " +
                address.getCountry() + ", " +
                address.getZipcode());

        ctx.close();
    }
}
