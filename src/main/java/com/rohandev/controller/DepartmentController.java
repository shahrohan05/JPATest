package com.rohandev.controller;

import com.rohandev.model.Department;
import com.rohandev.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Department")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @GetMapping("/{id}")
    public Department getDepartmentById(@PathVariable("id") int id) {
        return departmentService.getDepartmentById(id);
    }


}
