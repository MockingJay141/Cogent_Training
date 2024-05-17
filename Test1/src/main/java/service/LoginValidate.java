package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import repository.EmployeeRepository;

public class LoginValidate {


	public boolean checkLogin(Integer id, String password) throws SQLException, ClassNotFoundException {
		
		Connection conn = EmployeeRepository.getConnection();
		PreparedStatement ps = conn
				.prepareStatement("SELECT id, password FROM emp WHERE id = ? AND password = ?");
		// ?--Place holder
		ps.setInt(1, id);
		ps.setString(2, password);
		
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			return true;
		} else {
			return false;
		}
	}

}
