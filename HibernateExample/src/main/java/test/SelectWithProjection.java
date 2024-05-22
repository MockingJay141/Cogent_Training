package test;

import beans.Employee;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import java.util.Iterator;
import java.util.List;

public class SelectWithProjection {

    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure("resources/mysql.cfg.xml");

        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();

        Criteria criteria = session.createCriteria(Employee.class);

        Employee user = null;

        ProjectionList projectionList = Projections.projectionList();
        projectionList.add(Projections.max("salary"));
        projectionList.add(Projections.min("salary"));
        projectionList.add(Projections.avg("salary"));

        criteria.setProjection(projectionList);

        List list = criteria.list();
        Iterator iterator = list.iterator();
        if (!iterator.hasNext()){
            System.out.println("No data available");
        }
        else {
            while (iterator.hasNext()){
                System.out.println("\n");

                Object[] row = (Object[]) iterator.next();
                for (int i = 0; i < row.length; i++){
                    if (i == 0){
                        System.out.println("Max salary is: " + row[i]);
                    }
                    if (i == 1){
                        System.out.println("Min salary is: " + row[i]);
                    }
                    if (i == 2){
                        System.out.println("Avg salary is: " + row[i]);
                    }
                }

            }
        }

        session.close();
        sessionFactory.close();

    }
}
