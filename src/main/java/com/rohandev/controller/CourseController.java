package com.rohandev.controller;

import com.rohandev.model.Course;
import com.rohandev.repository.CourseRepository;
import com.rohandev.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Course")
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping("/{id}")
    public Course getCourseById(@PathVariable("id") int id) {
        return courseService.getCourseById(id);
    }
}
