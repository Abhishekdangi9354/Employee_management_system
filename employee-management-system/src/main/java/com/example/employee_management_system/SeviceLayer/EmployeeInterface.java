package com.example.employee_management_system.SeviceLayer;

import com.example.employee_management_system.EntitylLayer.Employee;

import java.util.List;

public interface EmployeeInterface {


        Employee createEmployee(Employee employee);

        List<Employee> getAllEmployees();

        Employee getEmployeeById(Long id);

        Employee updateEmployee(Long id, Employee employee);

        void deleteEmployee(Long id);
}

