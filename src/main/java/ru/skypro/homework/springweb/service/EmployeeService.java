package ru.skypro.homework.springweb.service;

import ru.skypro.homework.springweb.pojoEmployee.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    int getSumEmployeeSalary();
    int getMinEmployeeSalary();
    int getMaxEmployeeSalary();
    List<Employee> getHighSalaryEmployees();
}
