package com.usst.cpf.springboot.mapper;

import com.usst.cpf.springboot.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    @Select("select * from user")
    List<User> findAllUser();
}
