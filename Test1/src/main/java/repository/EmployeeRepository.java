package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EmployeeRepository {

	static Connection conn = null;

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bsm69", "root", "MockingJay@14");
		return conn;
	}

	public static void closeConnection() throws SQLException {
		conn.close();

	}

}