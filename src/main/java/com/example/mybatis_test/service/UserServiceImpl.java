package com.example.mybatis_test.service;

import com.example.mybatis_test.entity.User;
import com.example.mybatis_test.mapper.UserMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * xiaomu (dongnengyu@gmail.com)
 * 2018/3/6
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectUser(@Param("age") Integer age){
        return userMapper.selectUser( age);
    }
    public int insert(@Param("name") String name, @Param("age") Integer age){
        return 1;
    }
}
