package com.docker.spring.boot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDockerApplication {

	@GetMapping("/message")
	public String getMessage() {
		return "Dockerizing your Spring Boot Application !!!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerApplication.class, args);
	}

}
