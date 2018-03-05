package com.example.mybatis_test.entity;

/**
 * xiaomu (dongnengyu@gmail.com)
 * 2018/3/6
 */
public class User {

    private Long id;
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                        ", name='" + name + '\'' +
                        ", age=" + age
                ;
    }

}