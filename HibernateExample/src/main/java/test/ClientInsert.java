package test;


import beans.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class ClientInsert {

    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        System.out.println("Hello");

        cfg.configure("resources/mysql.cfg.xml");

        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();
        Employee employee = new Employee(101, "Allen", "allen@gmail.com", 1234);
        Employee employee1 = new Employee(102, "Omkar", "omkar@gmail.com", 4321);

        //save() method returns the ID
        session.saveOrUpdate(employee);
        session.saveOrUpdate(employee1);

        //persist() doesn't return anything
        //session.persist(employee);

        //session.saveOrUpdate(employee);

        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
