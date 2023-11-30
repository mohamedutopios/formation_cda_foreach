package com.example.dto.controller;


import com.example.dto.dto.UserCreateDto;
import com.example.dto.dto.UserReadDto;
import com.example.dto.model.User;
import com.example.dto.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/post")
    public ResponseEntity<UserReadDto> post(@RequestBody UserCreateDto userDto){
        return new ResponseEntity<UserReadDto>(userService.createUser(userDto), HttpStatus.CREATED);
    };

    @GetMapping("/{id}")
    public ResponseEntity<UserReadDto> post(@PathVariable("id") Integer id){
        return new ResponseEntity<UserReadDto>(userService.getUserById(id), HttpStatus.OK);
    };




}
