package com.rohandev.service;

import com.rohandev.model.Course;
import com.rohandev.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;

    public Course getCourseById(int id) {
        return courseRepository.findById(id).get();
    }
}
