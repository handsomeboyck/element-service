package com.ck.element;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ck.element.dao")
public class ElementApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElementApplication.class, args);
	}

}
