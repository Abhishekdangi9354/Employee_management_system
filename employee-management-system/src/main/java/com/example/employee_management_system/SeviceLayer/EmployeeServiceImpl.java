package com.example.employee_management_system.SeviceLayer;
import com.example.employee_management_system.EntitylLayer.Employee;
import com.example.employee_management_system.Repository.EmployeeRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service

public class EmployeeServiceImpl implements EmployeeInterface {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public Employee updateEmployee(Long id, Employee employee) {
        Employee existing = employeeRepository.findById(id).orElse(null);
        if (existing != null) {
            existing.setId(employee.getId());
            existing.setDepartment(employee.getDepartment());
            existing.setName(employee.getName());
            existing.setSalary(employee.getSalary());
            existing.setEmail(employee.getEmail());

            return employeeRepository.save(existing);
        }
        return null;
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }

    public EmployeeRepository getEmployeeRepository() {
        return employeeRepository;
    }
}

