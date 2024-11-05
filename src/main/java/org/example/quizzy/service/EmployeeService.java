package org.example.quizzy.service;


import org.example.quizzy.entity.Employee;

import java.util.List;


public interface EmployeeService{

    public List<Employee> getAllEmployees();

    public Employee getEmployeeById(Long id);

    public void addEmployee(Employee employee);

    public void updateEmployeeById(Long id, Employee employee);

    public void deleteEmployeeById(Long id);

    public void deleteAllEmployees();

}
