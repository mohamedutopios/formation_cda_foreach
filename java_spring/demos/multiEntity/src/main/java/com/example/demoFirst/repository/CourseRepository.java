package com.example.demoFirst.repository;

import com.example.demoFirst.model.Classroom;
import com.example.demoFirst.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {




}
