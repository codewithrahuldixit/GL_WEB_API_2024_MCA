package com.rahul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
public class RestApiSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiSecurityApplication.class, args);
	}

}
