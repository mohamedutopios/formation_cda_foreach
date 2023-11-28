package com.example.demoFirst.service;

import com.example.demoFirst.model.Student;

import java.util.List;
import java.util.Optional;

public interface IStudentService {

    List<Student> getAllStudents();

    Optional<Student> getStudentById(Long id);

    Student createStudent(Student student);

    void updateStudent(Student updateStudent);

    void deleteStudent(Long id);

    Optional<List<Student>> findByLastName(String lastname);
    Optional<List<Student>> findByAgeGreaterThan(int age);


}
