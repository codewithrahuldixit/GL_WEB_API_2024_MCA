package com.gl.rahul;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StudentRunner implements CommandLineRunner {
	@Autowired
	private StudentJpaRepository repository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repository.save(new Student(101, "Rahul", "Cse"));
		repository.save(new Student(102,"Dixit","IT"));
	}
}
