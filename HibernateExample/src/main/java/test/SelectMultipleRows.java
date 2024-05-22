package test;

import beans.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class SelectMultipleRows {

    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure("resources/mysql.cfg.xml");

        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();

        String hql = "FROM Employee";

        Query q = session.createQuery(hql);

        List<Employee> list = (List<Employee>) q.list();
        for (Employee ns1 : list){
            System.out.println("Id: " + ns1.getId());
            System.out.println("Name: " + ns1.getName());
            System.out.println("Email: " + ns1.getEmail());
            System.out.println("Salary: " + ns1.getSalary());
            System.out.println("==========================================");
        }

        session.close();
        sessionFactory.close();
    }
}
