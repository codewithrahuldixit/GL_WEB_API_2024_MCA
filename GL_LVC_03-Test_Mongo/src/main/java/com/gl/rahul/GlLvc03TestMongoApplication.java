package com.gl.rahul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class GlLvc03TestMongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GlLvc03TestMongoApplication.class, args);
	}

}
