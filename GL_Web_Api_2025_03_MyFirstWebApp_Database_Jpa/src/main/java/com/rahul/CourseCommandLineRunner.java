package com.rahul;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
	@Autowired
	CourseJPA repository;

	@Override
	public void run(String... args) throws Exception {
		repository.save(new Course(101, "Java Full Stack", "CSE"));
		repository.save(new Course(102, "Html", "CSE"));
		System.out.println(repository.findById(101));
		System.out.println(repository.findAll());
		

	}

}
