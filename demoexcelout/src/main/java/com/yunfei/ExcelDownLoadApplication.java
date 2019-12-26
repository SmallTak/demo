package com.yunfei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@ComponentScan(basePackages = "com.yunfei")
@EnableScheduling
public class ExcelDownLoadApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExcelDownLoadApplication.class, args);
	}

}
