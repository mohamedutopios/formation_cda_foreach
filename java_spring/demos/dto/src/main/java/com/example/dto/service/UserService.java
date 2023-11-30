package com.example.dto.service;

import com.example.dto.dto.UserCreateDto;
import com.example.dto.dto.UserReadDto;
import com.example.dto.model.User;

import java.util.Optional;


public interface UserService {

    UserReadDto createUser(UserCreateDto user);
   UserReadDto getUserById(Integer id);

}
