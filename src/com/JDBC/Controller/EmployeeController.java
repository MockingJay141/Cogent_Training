package com.JDBC.Controller;

import com.JDBC.Model.Employee;
import com.JDBC.Repository.DBRepository;
import com.JDBC.Service.EmployeeService;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

public class EmployeeController {

    EmployeeService employeeService = null;

    public static void main(String[] args) throws SQLException {

        EmployeeController ec = new EmployeeController();
        ec.fetchData();
        System.out.println("========================================");
        ec.insertData( new Employee(101, "OmkarKulkarni", "omkar@gmail.com", 6000.5F));
        ec.fetchData();
        System.out.println("========================================");
        Employee e = ec.fetchById(101);
        System.out.println(e);
        System.out.println("========================================");
        ec.update(new Employee(101, "Omkar", "omkar@gmail.com", 6000.5F));
        Employee e1 = ec.fetchById(101);
        System.out.println(e1);
        System.out.println("========================================");
        ec.delete(101);
        ec.fetchData();

        ec.closeConnection();
    }

    public void fetchData() throws SQLException {

        employeeService = new EmployeeService();
        List<Employee> employeeList = employeeService.fetchAll();

        Iterator<Employee> iterator = employeeList.iterator();

        while (iterator.hasNext()){
            Employee e = (Employee) iterator.next();
            System.out.println("Id: " + e.getId() +
                    ", Name: " + e.getName() +
                    ", Email: " + e.getEmail() +
                    ", Salary: " + e.getSalary());
        }


    }

    public void insertData(Employee employee) throws SQLException {

        employeeService = new EmployeeService();
        boolean checkInsert =  employeeService.save(employee);

        if (checkInsert){
            System.out.println("Employee Inserted Successfully with Id: " +employee.getId());
        }
        else {
            System.out.println("Employee insert failed");
        }

    }

    public Employee fetchById(int id) throws SQLException {
        employeeService = new EmployeeService();
        Employee employee = employeeService.fetchById(id);


        return employee;
    }

    public void update(Employee employee) throws SQLException {
        employeeService = new EmployeeService();

        boolean checkUpdate = employeeService.updateName(employee);
        if (checkUpdate){
            System.out.println("Employee Updated Successfully with Id: " + employee.getId());
        }
        else {
            System.out.println("Employee update failed");
        }

    }

    public void delete(int id) throws SQLException {
        employeeService = new EmployeeService();
        boolean checkDelete = employeeService.delete(101);
        if (checkDelete){
            System.out.println("Employee Deleted Successfully with Id: " + id);
        }
        else {
            System.out.println("Employee delete failed");
        }
    }

    public void closeConnection() throws SQLException {
        DBRepository.closeConnection();
    }
}
