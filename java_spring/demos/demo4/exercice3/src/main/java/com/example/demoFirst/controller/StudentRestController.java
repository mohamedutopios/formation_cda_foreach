package com.example.demoFirst.controller;

import com.example.demoFirst.model.Student;
import com.example.demoFirst.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/students")
public class StudentRestController {

    @Autowired
    private  IStudentService studentService;

    @GetMapping
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id){
        return studentService.getStudentById(id).get();
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }

    @PutMapping()
    public void updateStudent(@RequestBody Student student){
        studentService.updateStudent(student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id){
        studentService.deleteStudent(id);
    }


    @GetMapping("/search/lastname")
    public ResponseEntity<List<Student>> findByLastName(@RequestParam String lastname){
        Optional<List<Student>> listOptional = studentService.findByLastName(lastname);
        if(listOptional.isPresent()){
            return ResponseEntity.ok(listOptional.get());
        }else{
            return ResponseEntity.notFound().build();
        }

    }
    @GetMapping("/search/age")
    public ResponseEntity<List<Student>> findByAge(@RequestParam Integer age){
        Optional<List<Student>> listOptional = studentService.findByAgeGreaterThan(age);
        if(listOptional.isPresent()){
            return ResponseEntity.ok(listOptional.get());
        }else{
            return ResponseEntity.notFound().build();
        }

    }


}
