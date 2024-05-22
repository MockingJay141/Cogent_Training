package test;

import beans.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetEmployeeRecord {

    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure("resources/mysql.cfg.xml");

        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();

        Object object = session.get(Employee.class, 101);
        Employee employee = (Employee) object;

        System.out.println(employee.getName());
        session.close();
        sessionFactory.close();
    }
}
