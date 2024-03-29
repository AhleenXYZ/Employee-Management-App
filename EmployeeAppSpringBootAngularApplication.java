package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.example.demo", "controller", "Repository"})
public class EmployeeAppSpringBootAngularApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeAppSpringBootAngularApplication.class, args);
	}

}
