package test;

import beans.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class SelectMultipleRows {

    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure("resources/mysql.cfg.xml");

        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

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


        String hql1 = "FROM Employee WHERE id = 101";
        Query q1 = session.createQuery(hql1);
        Employee employee = (Employee) q1.uniqueResult();
        System.out.println("Id: " + employee.getId());
        System.out.println("Name: " + employee.getName());
        System.out.println("Email: " + employee.getEmail());
        System.out.println("Salary: " + employee.getSalary());
        System.out.println("==========================================");

        String hql2 = "DELETE FROM Employee WHERE id = 101";
        Query q2 = session.createQuery(hql2);
        int i = q2.executeUpdate();
        System.out.println("Employee Deleted: " + i);
        transaction.commit();
        System.out.println("==========================================");

        String hql3 = "UPDATE Employee SET name = 'OmkarKulkarni', email = 'omkar@gmail.com' WHERE id = 102";
        Query q3 = session.createQuery(hql3);
        int i2 = q3.executeUpdate();
        System.out.println("Employee Updated: " + i2);
        transaction.commit();
        System.out.println("==========================================");


        session.close();
        sessionFactory.close();
    }
}
