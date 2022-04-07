package com.example.musicl.service;

import com.example.musicl.UserRepository;
import com.example.musicl.dto.UserDto;
import com.example.musicl.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService{
    UserRepository repository;

    UserMapper userMapper;

    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Autowired
    public void setRepository(UserRepository repository) {
        this.repository = repository;
    }


    @Override
    public List<UserDto> list() {
        //使用usermapper实现转换
        //将数组中每一个user嗲用 usermapper的todto 返回
        return repository.findAll().stream().map(userMapper::toDto).collect(Collectors.toList());
    }
}
