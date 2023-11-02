package com.example.demoFirst.controller;


import com.example.demoFirst.service.IStudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class StudentController {

    private final IStudentService studentService;

//    public StudentController(IStudentService studentService){
//        this.studentService = studentService;
//    }

    @GetMapping
    public String home(){
        return "home";
    }

    @GetMapping("/students")
    public String showAllStudents(Model model){
        model.addAttribute("students",studentService.getAllStudents());
        return "list";
    }



}
