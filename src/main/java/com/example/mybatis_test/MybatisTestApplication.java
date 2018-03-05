package com.example.mybatis_test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.test.annotation.Rollback;
import org.springframework.util.Assert;

@SpringBootApplication
public class MybatisTestApplication {

	public static void main(String[] args) {

		SpringApplication.run(MybatisTestApplication.class, args);


	}
}
