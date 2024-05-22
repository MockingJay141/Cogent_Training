package test;

import beans.Employee;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class SelectUsingRestriction {

    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure("resources/mysql.cfg.xml");

        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();

        Criteria criteria = session.createCriteria(Employee.class);

        Criterion cr = Restrictions.eq("id", 101);

        criteria.add(cr);
        Employee employee = (Employee) criteria.uniqueResult();

        System.out.println("Id: " + employee.getId()+
                ", Name: " + employee.getName() +
                ", Email: " + employee.getEmail()+
                ", salary: " + employee.getSalary());

        session.close();
        sessionFactory.close();
    }
}
