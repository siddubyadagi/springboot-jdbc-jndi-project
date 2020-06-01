package com.accurate.solutions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.accurate.solutions")
public class Springboot {

	public static void main(String[] args) {
		SpringApplication.run(Springboot.class, args);
	}
}
