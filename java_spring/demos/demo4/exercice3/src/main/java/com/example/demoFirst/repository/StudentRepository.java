package com.example.demoFirst.repository;

import com.example.demoFirst.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
    List<Student> findByLastName(String lastname);
    List<Student> findByAgeGreaterThan(int age);


}
