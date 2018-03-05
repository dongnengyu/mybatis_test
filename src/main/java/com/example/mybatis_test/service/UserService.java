package com.example.mybatis_test.service;

import com.example.mybatis_test.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * xiaomu (dongnengyu@gmail.com)
 * 2018/3/6
 */
public interface UserService {
    @Autowired
    User selectUser(@Param("age") Integer age);
    @Autowired
    int insert(@Param("name") String name, @Param("age") Integer age);

}
