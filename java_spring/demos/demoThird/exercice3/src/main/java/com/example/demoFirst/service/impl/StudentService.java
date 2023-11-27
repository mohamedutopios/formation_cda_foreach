package com.example.demoFirst.service.impl;

import com.example.demoFirst.model.Student;
import com.example.demoFirst.repository.StudentRepository;
import com.example.demoFirst.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class StudentService implements IStudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(Long id) {
        return null;
    }

    @Override
    public Student createStudent(Student student) {
        return null;
    }

    @Override
    public Student updateStudent(Long id, Student updateStudent) {
        return null;
    }

    @Override
    public void deleteStudent(Long id) {

    }

}
