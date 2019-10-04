package com.relaxam.lanhai.manage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.relaxam.lanhai.manage.mapper")
public class LanhaiManageServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LanhaiManageServiceApplication.class, args);
	}

}
