package com.example.mybatis_test.controller;

import com.example.mybatis_test.entity.User;
import com.example.mybatis_test.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * xiaomu (dongnengyu@gmail.com)
 * 2018/3/6
 */
@RestController
@EnableAutoConfiguration
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "showUser/{age}")
    public User selectUser (@PathVariable Integer age){
        return userService.selectUser(age);
    }

    @RequestMapping(value = "showUser")
    public int insert(@Param("name") String name, @Param("age") Integer age){
        return 1;
    }

}
