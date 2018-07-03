package com.usst.cpf.react.mapper;

import com.usst.cpf.react.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    @Select("select * from user")
    List<User> findAllUser();
}
