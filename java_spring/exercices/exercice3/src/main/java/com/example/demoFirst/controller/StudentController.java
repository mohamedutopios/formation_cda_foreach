package com.example.demoFirst.controller;


import com.example.demoFirst.model.Student;
import com.example.demoFirst.service.IStudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("student/{id}")
    public String showStudentById(@PathVariable Long id,Model model){
        model.addAttribute("student",studentService.getStudentById(id));
        return "detail";
    }

   // <form th:action="@{/submitForm}" th:object="${studentSubmit}" method="post">
    @PostMapping("/submitForm")
    public String submitForm(@ModelAttribute("studentSubmit") Student studentSubmit ){
        System.out.println(studentSubmit.getId());
        System.out.println(studentSubmit);
        if(studentSubmit.getId() == null){
            studentService.createStudent(studentSubmit);
        }else {
            studentService.updateStudent(studentSubmit.getId(), studentSubmit);
        }

        return "redirect:/students";
    }

    @GetMapping("/formulaire")
    public String formAddStudent(Model model){
        Student student = new Student();
        model.addAttribute("studentSubmit",student);
        return "form";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("studentId") Long id){
        studentService.deleteStudent(id);
        return "redirect:/students";
    }

    @GetMapping("/update")
    public String showFormForUpdate(@RequestParam("studentId") Long id,Model model){
        Student student = studentService.getStudentById(id);
        model.addAttribute("studentSubmit",student);

        return "form";
    }




}
