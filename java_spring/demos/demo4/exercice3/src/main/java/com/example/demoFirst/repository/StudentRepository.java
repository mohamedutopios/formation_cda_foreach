package com.example.demoFirst.repository;

import com.example.demoFirst.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByLastName(String lastname);

    List<Student> findByAgeGreaterThan(int age);

    @Query("SELECT s FROM Student s WHERE s.lastName = :lastName")
    List<Student> searchByLastName(@Param("lastName") String lastName);

    @Query("SELECT s FROM Student s WHERE s.age >= :age")
    List<Student> searchByAge(int age);

}
