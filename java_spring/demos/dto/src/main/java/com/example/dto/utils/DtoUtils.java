package com.example.dto.utils;

import com.example.dto.dto.UserDto;
import com.example.dto.model.User;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class DtoUtils {

public UserDto convertToDto(User user,UserDto userDto){
    return new ModelMapper().map(user,userDto.getClass());
}

public User convertToEntity(User user, UserDto userDto){
    return new ModelMapper().map(userDto,user.getClass());
}

}
