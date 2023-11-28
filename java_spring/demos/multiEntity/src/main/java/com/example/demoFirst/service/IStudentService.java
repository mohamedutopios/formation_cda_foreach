package com.example.demoFirst.service;

import com.example.demoFirst.model.Student;

import java.util.List;
import java.util.Optional;

public interface IStudentService extends IGenericService<Student, Long>{

    Optional<List<Student>> findByLastName(String lastname);
    Optional<List<Student>> findByAgeGreaterThan(int age);

    List<Student> findByNameCourseName(String courseName);



}
