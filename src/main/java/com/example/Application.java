package com.example;

import config.JpaConfig;
import config.WebConfig;
import config.WebSecurityConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(new Class<?>[] {Application.class,
				JpaConfig.class, WebConfig.class, WebSecurityConfig.class}, args);
	}
}