package com.example.dto.service.impl;

import com.example.dto.dto.UserCreateDto;
import com.example.dto.dto.UserReadDto;
import com.example.dto.model.User;
import com.example.dto.repository.UserRepository;
import com.example.dto.service.UserService;
import com.example.dto.utils.DtoUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    UserRepository userRepository;

    @Autowired
    DtoUtils dtoUtils;

    @Override
    public UserReadDto createUser(UserCreateDto userCreateDto) {
     User user = dtoUtils.convertToEntity(userCreateDto, User.class);
     User user1 = userRepository.save(user);
        return (UserReadDto) dtoUtils.convertToDto(user1, UserReadDto.class);
    }

    public UserReadDto getUserById(Integer id) {
        return (UserReadDto) dtoUtils.convertToDto(userRepository.findById(id).get(), UserReadDto.class);
    }
}
