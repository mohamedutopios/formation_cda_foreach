package com.example.dto.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserCreateDto implements UserDto{
    private String username;
    private String email;
    private String password;
}
