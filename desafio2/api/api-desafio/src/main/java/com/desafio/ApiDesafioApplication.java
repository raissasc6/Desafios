package com.desafio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.desafio.models")
public class ApiDesafioApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiDesafioApplication.class, args);
	}
}