package com.jay;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.jay.dao")
public class MybatisplusSpringBootSimpleApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisplusSpringBootSimpleApplication.class, args);
		System.out.println("===================启动成功！==========================");
	}
}
