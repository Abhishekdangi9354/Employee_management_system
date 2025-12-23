package com.example.employee_management_system.Repository;

import com.example.employee_management_system.EntitylLayer.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
