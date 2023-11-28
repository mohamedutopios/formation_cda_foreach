package com.example.demoFirst.service.impl;

import com.example.demoFirst.model.Course;
import com.example.demoFirst.repository.CourseRepository;
import com.example.demoFirst.service.IGenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CourseService implements IGenericService<Course, Long> {

    @Autowired
    private CourseRepository courseRepository;


    @Override
    public List<Course> findall() {
        return courseRepository.findAll();
    }

    @Override
    public Optional<Course> findById(Long id) {
        return courseRepository.findById(id);
    }

    @Override
    public Course save(Course entity) {
        return courseRepository.save(entity);
    }

    @Override
    public void deleteById(Long id) {
        courseRepository.deleteById(id);
    }
}
