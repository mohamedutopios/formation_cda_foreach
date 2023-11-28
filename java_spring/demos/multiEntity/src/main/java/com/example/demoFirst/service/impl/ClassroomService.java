package com.example.demoFirst.service.impl;

import com.example.demoFirst.model.Classroom;
import com.example.demoFirst.model.Student;
import com.example.demoFirst.repository.ClassroomRepository;
import com.example.demoFirst.service.IGenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ClassroomService implements IGenericService<Classroom,Long> {

    @Autowired
    private ClassroomRepository classroomRepository;



    @Override
    public List<Classroom> findall() {
        return classroomRepository.findAll();
    }

    @Override
    public Optional<Classroom> findById(Long id) {
        return classroomRepository.findById(id);
    }

    @Override
    public Classroom save(Classroom entity) {
        return classroomRepository.save(entity);
    }

    @Override
    public void deleteById(Long id) {
        classroomRepository.deleteById(id);
    }
}
