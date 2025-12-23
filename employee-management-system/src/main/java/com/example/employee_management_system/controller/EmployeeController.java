package com.example.employee_management_system.controller;

import com.example.employee_management_system.EntitylLayer.Employee;
import com.example.employee_management_system.SeviceLayer.EmployeeServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

        @Autowired
        private EmployeeServiceImpl service;

        @PostMapping
        public Employee createEmployee(@Valid @RequestBody Employee employee) {
            return service.createEmployee(employee);
        }

        @GetMapping
        public List<Employee> getAllEmployees() {
            return service.getAllEmployees();
        }

        @GetMapping("/{id}")
        public Employee getEmployeeById(@PathVariable Long id) {
            return service.getEmployeeById(id);
        }

        @PutMapping("/{id}")
        public Employee updateEmployee(@PathVariable Long id,
                                       @Valid @RequestBody Employee employee) {
            return service.updateEmployee(id, employee);
        }

        @DeleteMapping("/{id}")
        public String deleteEmployee(@PathVariable Long id) {
            service.deleteEmployee(id);
            return "Employee deleted successfully";
        }

    }

