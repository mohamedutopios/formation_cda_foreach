package com.example.demoFirst.service.impl;

import com.example.demoFirst.model.Student;
import com.example.demoFirst.repository.StudentRepository;
import com.example.demoFirst.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class StudentService implements IStudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<Student> getStudentById(Long id) {
        return studentRepository.findById(id);
    }

    @Override
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void updateStudent(Student updateStudent) {

        studentRepository.save(updateStudent);
    }
    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Optional<List<Student>> findByLastName(String lastName){
        List<Student> listes = studentRepository.searchByLastName(lastName);
        return listes.isEmpty() ? Optional.empty() : Optional.of(listes);
    }

    @Override
    public Optional<List<Student>> findByAgeGreaterThan(int age) {
        List<Student> listes = studentRepository.searchByAge(age);
        return listes.isEmpty() ? Optional.empty() : Optional.of(listes);
    }


}
