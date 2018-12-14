package com.lanpangzi.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan(basePackages = "com.lanpangzi")
@MapperScan(basePackages = "com.lanpangzi.mapper")
@SpringBootApplication
public class RingApplication {

	public static void main(String[] args) {
		SpringApplication.run(RingApplication.class, args);
	}

}

