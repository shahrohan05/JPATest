package com.rohandev.service;

import com.rohandev.model.Department;
import com.rohandev.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    @Autowired
    DepartmentRepository departmentRepository;

    public Department getDepartmentById(int id) {
        return departmentRepository.findById(id).get();
    }
}
