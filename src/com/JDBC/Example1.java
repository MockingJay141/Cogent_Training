package com.JDBC;

import com.JDBC.Repository.DBRepository;

import java.sql.*;

/**
 * JDBC Steps:
 * 1. We have to load the driver: this acts a bridge between Java and Database
 * 2. Open the connection
 * 3. Issue
 */
public class Example1 {

    public static void main(String[] args) throws SQLException {



        Connection connection = DBRepository.getConnection();

        PreparedStatement ps = connection.prepareStatement("SELECT * FROM employee");


        ResultSet rs = ps.executeQuery();

        while (rs.next()){

            System.out.println("Id: " + rs.getInt(1) +
                    ", Name: " + rs.getString(2) +
                    ", Email: " + rs.getString(3) +
                    ", Salary: " + rs.getFloat(4));
        }

        connection.close();

    }
}
