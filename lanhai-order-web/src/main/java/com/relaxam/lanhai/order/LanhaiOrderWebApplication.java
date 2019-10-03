package com.relaxam.lanhai.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.relaxam.lanhai")
public class LanhaiOrderWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(LanhaiOrderWebApplication.class, args);
	}

}
