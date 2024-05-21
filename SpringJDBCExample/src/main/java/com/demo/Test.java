package com.demo;

import com.demo.model.Person;
import com.demo.spring.config.AppConfig;
import com.demo.spring.dao.PersonDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Iterator;
import java.util.ListIterator;

public class Test {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        PersonDAO personDAO = context.getBean(PersonDAO.class);

        System.out.println("Creating Person: ");
        Person person = new Person(7L, 25, "Omkar", "Kulkarni");
        boolean flag = personDAO.createPerson(person);
        if(flag)
            System.out.println(person);
        else
            System.out.println("Error");
        System.out.println("===================================================================");

        System.out.println("Find all persons");
        Iterator<Person> iterator = personDAO.getAllPersons().iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("===================================================================");

        System.out.println("Update Person");
        Person person1 = new Person(7L, 29, "OmkarKulkarni", "Kulkarni");
        boolean update = personDAO.updatePerson(person1);
        if(update)
            System.out.println("Person Updated: " + person1);
        else
            System.out.println("Error");
        System.out.println("===================================================================");

        System.out.println("Find person by id");
        Person gotPerson = personDAO.getPersonById(6L);
        System.out.println("Person found: " + gotPerson);
        System.out.println("===================================================================");


        System.out.println("Delete person");
        boolean delete = personDAO.deletePerson(person);
        if(delete)
            System.out.println("Person Deleted: " + person);
        else
            System.out.println("Error");
        System.out.println("===================================================================");

        System.out.println("Final state of the database");
        Iterator<Person> iterator1 = personDAO.getAllPersons().iterator();

        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }



        context.close();
    }
}
