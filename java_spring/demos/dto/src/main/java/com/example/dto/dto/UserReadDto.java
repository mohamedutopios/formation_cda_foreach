package com.example.dto.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class UserReadDto implements UserDto{
    private Integer id;
    private String username;
    private String email;

}
