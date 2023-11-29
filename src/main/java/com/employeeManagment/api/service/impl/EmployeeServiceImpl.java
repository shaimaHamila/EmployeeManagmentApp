package com.employeeManagment.api.service.impl;

import com.employeeManagment.api.dto.EmployeeDto;
import com.employeeManagment.api.model.Employee;
import com.employeeManagment.api.repository.EmployeeRepository;
import com.employeeManagment.api.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<EmployeeDto> getAllEmployees() {
        List<Employee> employees = employeeRepository.findAll();
        return employees.stream().map(employee -> mapTpEmployeeTdo(employee)).collect(Collectors.toList());
    }

    @Override
    public Employee getEmployeeById(Long employeeId) {
        Employee employee = employeeRepository.findById(employeeId).get();
        return employee;
    }

    @Override
    public EmployeeDto saveEmployee(Employee employee) {
        Employee newEmployee = employeeRepository.save(employee);
        return mapTpEmployeeTdo(newEmployee);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        Employee updatedEmployee = employeeRepository.save(employee);
        return updatedEmployee;
    }

    @Override
    public void deleteEmployee(Long employeeId) {
        employeeRepository.deleteById(employeeId);
    }

    public EmployeeDto mapTpEmployeeTdo(Employee employee){
        EmployeeDto employeeDto = EmployeeDto.builder()
                .id(employee.getId())
                .firstName(employee.getFirstName())
                .secondName(employee.getSecondName())
                .email(employee.getEmail())
                .build();
        return employeeDto;
    }

}
