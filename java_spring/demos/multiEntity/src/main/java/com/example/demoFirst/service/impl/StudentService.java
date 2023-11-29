package com.example.demoFirst.service.impl;

import com.example.demoFirst.model.Course;
import com.example.demoFirst.model.Student;
import com.example.demoFirst.repository.CourseRepository;
import com.example.demoFirst.repository.StudentRepository;
import com.example.demoFirst.service.IStudentService;
import org.springframework.transaction.annotation.Transactional;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;


@Service
public class StudentService implements IStudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private CourseRepository courseRepository;

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

    @Override
    public List<Student> findByNameCourseName(String courseName) {
        return studentRepository.findByCourseName(courseName);
    }

    @Transactional
    @Override
    public Student addStudentCourse(Long studentId, Set<Long> courseIds){
        Student student = studentRepository
                .findById(studentId)
                .orElseThrow(()-> new RuntimeException("Student not found"));

        for(Long courseId: courseIds){
            Course course = courseRepository
                    .findById(courseId)
                    .orElseThrow(()-> new RuntimeException("Cours non trouvé"));
            student.getCourses().add(course);
        }
        return studentRepository.save(student);
    }


    @Override
    public Set<Course> getCoursesByStudentId(Long studentId) {
        Student student = studentRepository.
                findByIdWithCourses(studentId).orElseThrow(()-> new RuntimeException("Pas trouve"));
        return student.getCourses();
    }

    @Transactional
    @Override
    public List<Student> findall() {
        List<Student> students = studentRepository.findAll();
        students.forEach(student -> Hibernate.initialize(student.getCourses()));
        return students;
    }

    @Override
    public Optional<Student> findById(Long id) {
        return studentRepository.findById(id);
    }

    @Override
    public Student save(Student entity) {
        return studentRepository.save(entity);
    }

    @Override
    public void deleteById(Long id) {
        studentRepository.deleteById(id);
    }
}
