package com.jay.mybatisplus;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
@MapperScan("com.jay.mybatisplus.dao.*")
public class MybatisplusSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisplusSpringBootApplication.class, args);
		log.info("===================启动成功！==========================");
	}
}
