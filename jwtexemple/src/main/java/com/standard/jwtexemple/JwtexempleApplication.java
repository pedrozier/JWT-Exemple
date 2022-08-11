package com.standard.jwtexemple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@EnableWebSecurity
@SpringBootApplication
public class JwtexempleApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtexempleApplication.class, args);
	}

}
