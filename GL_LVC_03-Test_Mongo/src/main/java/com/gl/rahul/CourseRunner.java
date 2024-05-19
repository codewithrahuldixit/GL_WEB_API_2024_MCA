package com.gl.rahul;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseRunner implements CommandLineRunner{
	@Autowired
	private CourseRepository repository;
@Override
public void run(String... args) throws Exception {
	// TODO Auto-generated method stub
	repository.save(new Course(101,"Java","Rahul"));
}
}
