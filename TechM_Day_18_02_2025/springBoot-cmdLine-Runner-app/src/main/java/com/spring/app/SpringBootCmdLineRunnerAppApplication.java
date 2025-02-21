package com.spring.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootCmdLineRunnerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCmdLineRunnerAppApplication.class, args);
		System.out.println("It is a Starter Class of Spring Boot Application");
	}

}
