package com.example.mybatis_test.mapper;

import com.example.mybatis_test.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * xiaomu (dongnengyu@gmail.com)
 * 2018/3/6
 */
@Mapper
public interface UserMapper {

    @Select("SELECT * FROM USER WHERE AGE = #{age}")
    User selectUser(@Param("age") Integer age);

    @Insert("INSERT INTO USER(NAME, AGE) VALUES(#{name}, #{age})")
    int insert(@Param("name") String name, @Param("age") Integer age);

}