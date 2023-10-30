package com.example.demoFirst.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HelloController {

    @RequestMapping(value = "/hello")
    public String sayHello(){
        System.out.println("methode sayHello !!!");
        return "hello";
    }


    @RequestMapping(value = "/")
    public String sayCoucou(Model model){
        System.out.println("Home Page");
        model.addAttribute("firstname","Aijou");
        return "home";
    }

    @RequestMapping(value = "/personnes")
    @ResponseBody
    public List<String> personJson(){
        return List.of("John Dupont","Maria Martez","Chloée Smith");
    }
}
