package com.gl.rahul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class GlLvc04Application {

	public static void main(String[] args) {
		SpringApplication.run(GlLvc04Application.class, args);
	}

}
