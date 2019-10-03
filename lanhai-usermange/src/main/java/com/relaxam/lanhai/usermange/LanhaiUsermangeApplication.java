package com.relaxam.lanhai.usermange;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages ="com.relaxam.lanhai.usermange.mapper")
public class LanhaiUsermangeApplication {
	private static Logger logger = LoggerFactory.getLogger(LanhaiUsermangeApplication.class);

	public static void main(String[] args) {
		logger.info("springBoot模块：usermanage的主程序开始启动！");
		SpringApplication.run(LanhaiUsermangeApplication.class, args);
		logger.info("springBoot模块：usermanage的主程序启动完成！");
	}

}
