package test;

import beans.Employee;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class FetchUsingCriteria1 {

    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure("resources/mysql.cfg.xml");

        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();

        Criteria criteria = session.createCriteria(Employee.class);
        List<Employee> employeeList = criteria.list();

        for (Employee ns : employeeList){
            System.out.println("Id: " + ns.getId()+
                    ", Name: " + ns.getName() +
                    ", Email: " + ns.getEmail()+
                    ", salary: " + ns.getSalary());
        }

        session.close();
        sessionFactory.close();
    }
}
