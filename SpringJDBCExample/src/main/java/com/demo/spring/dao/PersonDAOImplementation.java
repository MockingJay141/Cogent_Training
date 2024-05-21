package com.demo.spring.dao;

import com.demo.model.Person;
import com.demo.model.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

@Component
public class PersonDAOImplementation implements PersonDAO{

    JdbcTemplate jdbcTemplate;

    private final String SQL_Find_Person = "SELECT * FROM people WHERE id = ?";
    private final String SQL_Delete_Person = "DELETE FROM people WHERE id = ?";
    private final String SQL_Update_person = "UPDATE people SET first_name = ?, last_name = ?, age = ?  WHERE id = ?";
    private final String SQL_getAll = "SELECT * FROM people";
    private final String SQL_Insert_person = "INSERT INTO people(id, first_name, last_name, age) VALUES(?, ?, ?, ?)";

    @Autowired
    public PersonDAOImplementation(DataSource dataSource){
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public Person getPersonById(Long id) {
        return jdbcTemplate.queryForObject(SQL_Find_Person, new Long[]{id}, new PersonMapper());
    }

    @Override
    public List<Person> getAllPersons() {
        return jdbcTemplate.query(SQL_getAll, new PersonMapper());
    }

    @Override
    public boolean deletePerson(Person person) {
        return jdbcTemplate.update(SQL_Delete_Person, person.getId()) > 0;
    }

    @Override
    public boolean updatePerson(Person person) {
        return jdbcTemplate.update(SQL_Update_person, person.getFirstName(), person.getLastName(), person.getAge(),
                person.getId()) > 0;
    }

    @Override
    public boolean createPerson(Person person) {
        return jdbcTemplate.update(SQL_Insert_person, person.getId(), person.getFirstName(), person.getLastName(),
                person.getAge()) > 0;
    }
}
