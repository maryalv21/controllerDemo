package com.ironhack.controllerDemo.impl;

import com.ironhack.controllerDemo.interfaces.CourseController;
import com.ironhack.controllerDemo.model.Course;
import com.ironhack.controllerDemo.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class CourseControllerImpl implements CourseController {

    @Autowired
    private CourseRepository courseRespository;

    @GetMapping("/courses")
    @ResponseStatus(HttpStatus.OK)
    public List<Course> findAll() {
        return courseRespository.findAll();
    }

    @GetMapping("/courses/{code}")
    public Course findById(@PathVariable String code) {
        Optional<Course> optionalCourse = courseRespository.findById(code);
        return optionalCourse.get();
    }
}
