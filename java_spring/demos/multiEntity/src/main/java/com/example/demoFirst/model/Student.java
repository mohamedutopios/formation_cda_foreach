package com.example.demoFirst.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    private int age;

    @OneToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name="address_id")
    private Address address;

    @ManyToOne
    @JoinColumn(name="classroom_id")
    private Classroom classroom;

    @ManyToMany
    @JoinTable(name="student_course",
            joinColumns = @JoinColumn(name="student_id"),
            inverseJoinColumns = @JoinColumn(name="course_id"))
    @JsonManagedReference
    private Set<Course> courses;

    public Student(){
        this.courses = new HashSet<>();
    }


}
