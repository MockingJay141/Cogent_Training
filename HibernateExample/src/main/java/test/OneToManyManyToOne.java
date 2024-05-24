package test;

import beans.oneToMany.Student;
import beans.oneToMany.StudentAddress;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.HashSet;
import java.util.Set;

public class OneToManyManyToOne {

    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure("resources/mysql.cfg.xml");

        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        StudentAddress a1 = new StudentAddress();
        a1.setAddress_details("US");

        Student s1 = new Student();
        s1.setStudent_name("Allen");
        s1.setStudent_address(a1);

        Student s2 = new Student();
        s2.setStudent_name("Omkar");
        s2.setStudent_address(a1);

        Set<Student> studentSet = new HashSet<>();
        studentSet.add(s1);
        studentSet.add(s2);

        a1.setStudents(studentSet);

        session.save(a1);
        transaction.commit();

        session.close();
        sessionFactory.close();
    }
}
