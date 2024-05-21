package com.demo.spring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * @Configuration : is an annotation is used to define the class all the configurations of the application.
 * If we don't annotate this class as 'Configuration' then JVM will not process it as configuration and treat is as
 * a Normal class
 *
 * @ComponentScan : This is the annotation to define the path where all the components are stored we will be using constructor
 * injection method to create instance of the component classes.
 *
 * @PropertySource : This is the annotation used to define the path where all the database properties like url, user, password
 * are stored
 *
 */
@Configuration
@ComponentScan("com.demo.spring")
@PropertySource("classpath:database.properties")
public class AppConfig {

    /**
     * This sets up the Spring environment for the project
     */
    @Autowired
    Environment environment;

    private final String URL = "url";
    private final String USER = "dbuser";
    private final String DRIVER = "driver";
    private final String PASSWORD = "dbpassword";

    /**
     * This is the Bean method that is used to connect to database, we are using the data stored in database.properties
     * class to get the url, user, password of the database and create a connection here.
     * @return
     */
    @Bean
    DataSource dataSource() {
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setUrl(environment.getProperty(URL));
        driverManagerDataSource.setUsername(environment.getProperty(USER));
        driverManagerDataSource.setPassword(environment.getProperty(PASSWORD));
        driverManagerDataSource.setDriverClassName(environment.getProperty(DRIVER));
        return driverManagerDataSource;
    }
}

