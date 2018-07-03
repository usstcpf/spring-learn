package com.usst.cpf.react.controller;

import com.usst.cpf.react.entity.User;
import com.usst.cpf.react.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IndexController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/")
    public String greeting() {
        return "Hello World!";
    }

    @RequestMapping("/user")
    public List<User> getUsers() {
        List<User> users = userMapper.findAllUser();
        users.stream().forEach(user -> System.out.println(user));
        return users;
    }
}
