package com.example.musicl.service;

import com.example.musicl.dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    List<UserDto> list();
}
