package com.example.demoFirst.repository;

import com.example.demoFirst.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByLastName(String lastname);

    List<Student> findByAgeGreaterThan(int age);

    @Query("SELECT s FROM Student s WHERE s.lastName = :lastName")
    List<Student> searchByLastName(@Param("lastName") String lastName);

    @Query("SELECT s FROM Student s WHERE s.age >= :age")
    List<Student> searchByAge(int age);

    @Query("SELECT s FROM Student s JOIN s.courses c WHERE c.name = :courseName")
    List<Student> findByCourseName(@Param("courseName") String courseName);
    @Query("SELECT s FROM Student s LEFT JOIN FETCH s.courses WHERE s.id = :id")
    Optional<Student> findByIdWithCourses(@Param("id") Long id);
}
