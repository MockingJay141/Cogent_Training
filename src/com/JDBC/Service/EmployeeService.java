package com.JDBC.Service;

import com.JDBC.Model.Employee;
import com.JDBC.Repository.DBRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

    public List<Employee> fetchAll() throws SQLException {

        Connection connection = DBRepository.getConnection();

        PreparedStatement ps = connection.prepareStatement("SELECT * FROM employee");


        ResultSet rs = ps.executeQuery();
        List<Employee> employeeList = new ArrayList<>();

        while (rs.next()){

            Employee e = new Employee(rs.getInt(1), rs.getString(2),
                    rs.getString(3), rs.getFloat(4));
            employeeList.add(e);
        }

        return employeeList;
    }
}
