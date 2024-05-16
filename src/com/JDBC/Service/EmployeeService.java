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

    public Employee fetchById(int id) throws SQLException {
        Connection connection = DBRepository.getConnection();
        Employee e = null;

        PreparedStatement ps = connection.prepareStatement("SELECT * FROM employee WHERE id = ?");
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        while (rs.next()){

            e = new Employee(rs.getInt(1), rs.getString(2),
                    rs.getString(3), rs.getFloat(4));
        }

        return e;
    }

    public boolean updateName(Employee employee) throws SQLException {
        Connection connection = DBRepository.getConnection();

        PreparedStatement ps = connection.prepareStatement("UPDATE employee SET name = ? WHERE id = ?");
        ps.setString(1, employee.getName());
        ps.setInt(2, employee.getId());
        int x = ps.executeUpdate();
        if (x > 0){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean delete(int id) throws SQLException {
        Connection connection = DBRepository.getConnection();

        PreparedStatement ps = connection.prepareStatement("DELETE FROM employee WHERE id = ?");
        ps.setInt(1, id);
        int x = ps.executeUpdate();
        if (x > 0){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean save(Employee employee) throws SQLException {

        Connection connection = DBRepository.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO employee(id, name, email, salary) " +
                "VALUES(?, ?, ?, ?)");
        preparedStatement.setInt(1, employee.getId());
        preparedStatement.setString(2, employee.getName());
        preparedStatement.setString(3, employee.getEmail());
        preparedStatement.setFloat(4, employee.getSalary());

        int x = preparedStatement.executeUpdate();
        if (x > 0){
            return true;
        }
        else {
            return false;
        }
    }
}
