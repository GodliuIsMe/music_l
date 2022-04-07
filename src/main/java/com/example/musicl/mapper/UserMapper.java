package com.example.musicl.mapper;

import com.example.musicl.dto.UserDto;
import com.example.musicl.entity.User;
import com.example.musicl.vo.UserVo;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

//指定spring的model
//指定component 注入
@Mapper(componentModel = "spring")
@Component
public interface UserMapper {
    //dto vo  entity 之间的转换
    UserDto toDto(User user);

    UserVo toVo(UserDto userDto);
}
