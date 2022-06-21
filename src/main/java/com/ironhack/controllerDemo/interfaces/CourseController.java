package com.ironhack.controllerDemo.interfaces;

import com.ironhack.controllerDemo.model.Course;

import java.util.List;

public interface CourseController {
    List<Course> findAll();
    Course findById(String code);
}
