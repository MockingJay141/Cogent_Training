package test;

import beans.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteEmployee {

    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure("resources/mysql.cfg.xml");

        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Employee e = new Employee();
        e.setId(102);
        session.delete(e);

        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
