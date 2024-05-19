package com.gl.rahul;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//@Component
public class StudentCommandLineRunner implements CommandLineRunner{

	private StudentRepository repository;
	public StudentCommandLineRunner(StudentRepository repository) {
		super();
		this.repository = repository;
	}
	@Override
	public void run(String... args) throws Exception {
		repository.save(new Student(101,"Rahul","Delhi"));
		repository.save(new Student(102,"Rakesh","Noida"));
		repository.deleteById(101);
	}

}
