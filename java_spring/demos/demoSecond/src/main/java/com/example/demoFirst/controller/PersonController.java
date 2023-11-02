package com.example.demoFirst.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonController {


    @GetMapping
    public String homePage(){
        return "home";
    }

    @GetMapping("/second")
    public String secondPage(){
        return "pageB";
    }

}
