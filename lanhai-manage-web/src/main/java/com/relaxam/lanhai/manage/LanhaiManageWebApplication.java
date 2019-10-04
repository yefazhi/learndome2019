package com.relaxam.lanhai.manage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.relaxam.lanhai")
public class LanhaiManageWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(LanhaiManageWebApplication.class, args);
	}

}
