package test;

import beans.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateEmployee {

    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure("resources/mysql.cfg.xml");

        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Employee emp = (Employee) session.get(Employee.class, 102);

       // Employee employee = new Employee(102, "Omkar", "omkar@gmail.com", 1234);
        Employee employee1 = new Employee();
        employee1.setId(103);
        employee1.setEmail("something@gmail.com");
        session.merge(employee1);

        //session.merge(employee);
        transaction.commit();

        session.close();
        sessionFactory.close();
    }
}
