package com.rohandev.service;

import com.rohandev.model.Employee;
import com.rohandev.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public Employee getEmployeeById(int id) {
        return employeeRepository.findById(id).get();
    }

    public List<Employee> getEmployeesByDepartment(String departmentName) {
            return employeeRepository.getEmployeesByDepartment(departmentName, PageRequest.of(0,3).withSort(Sort.Direction.DESC,"salary"));
    }


    public List<Employee> getEmployeesWithSalaryHigherThan(int minSalary) {
        return employeeRepository.getEmployeesWithSalaryHigherThan(minSalary);
    }
}
