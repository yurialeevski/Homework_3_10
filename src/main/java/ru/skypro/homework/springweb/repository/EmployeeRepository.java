package ru.skypro.homework.springweb.repository;

import ru.skypro.homework.springweb.pojoEmployee.Employee;

import java.util.List;

public interface EmployeeRepository {
    List<Employee> getAllEmployees();
    int getSumSalary();
    int getMinSalary();
    int getMaxSalary();
    List<Employee> getHighSalary();
}
