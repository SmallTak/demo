package com.autoinput.sqlser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@ComponentScan(basePackages = "com.autoinput.sqlser.*")
@EnableScheduling
public class SqlserApplication {

	public static void main(String[] args) {
		SpringApplication.run(SqlserApplication.class, args);
	}

}
