package com.example.demoFirst.service;

import com.example.demoFirst.model.Course;
import com.example.demoFirst.model.Student;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface IStudentService extends IGenericService<Student, Long>{

    Optional<List<Student>> findByLastName(String lastname);
    Optional<List<Student>> findByAgeGreaterThan(int age);

    List<Student> findByNameCourseName(String courseName);

    Set<Course> getCoursesByStudentId(Long studentId);
    public Student addStudentCourse(Long studentId, Set<Long> courseIds);

}
