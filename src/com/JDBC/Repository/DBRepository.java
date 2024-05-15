package com.JDBC.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBRepository {

    static Connection connection = null;

    public static Connection getConnection() throws SQLException {

        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bsm69",
                "root", "MockingJay@14");

        return connection;
    }

    public static void closeConnection() throws SQLException {
        connection.close();
    }
}
