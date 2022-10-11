package com.rohandev.controller;

import com.rohandev.model.Employee;
import com.rohandev.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("{id}")
    public Employee getEmployee(@PathVariable("id") int id) {
        return employeeService.getEmployeeById(id);
    }

    @GetMapping("/Top3")
    public List<Employee> getTop3Employee(@RequestParam("department") String department) {
        return employeeService.getEmployeesByDepartment(department);
    }

    @GetMapping("/SalaryHigherThan")
    public List<Employee> getEmployeesWithSalaryHigherThan(@RequestParam("minSalary") int minSalary) {
        return employeeService.getEmployeesWithSalaryHigherThan(minSalary);
    }
}
