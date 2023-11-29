package com.employeeManagment.api.service;

import com.employeeManagment.api.dto.EmployeeDto;
import com.employeeManagment.api.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<EmployeeDto> getAllEmployees();
    Employee getEmployeeById(Long employeeId);
    EmployeeDto saveEmployee(Employee employee);
    Employee updateEmployee(Employee employee);
    void deleteEmployee(Long employeeId);
}
