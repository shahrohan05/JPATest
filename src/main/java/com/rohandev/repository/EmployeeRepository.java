package com.rohandev.repository;

import com.rohandev.model.Employee;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    @Query("from Employee where department.name = :departmentName")
    public List<Employee> getEmployeesByDepartment(String departmentName, Pageable pageable);

    @Query("from Employee where salary > :minSalary")
    List<Employee> getEmployeesWithSalaryHigherThan(long minSalary);
}