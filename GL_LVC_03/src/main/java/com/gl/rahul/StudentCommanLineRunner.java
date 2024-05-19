package com.gl.rahul;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.gl.rahul.bean.Student;

@Component
public class StudentCommanLineRunner implements CommandLineRunner {

	/*
	 * Student Template
	 * StudentJdbcTemplate repository;
	
	public StudentCommanLineRunner(StudentJdbcTemplate repository) {
		super();
		this.repository = repository;
	}
*/
	/*
	private StudentJpaRepository repository;
	
	
	public StudentCommanLineRunner(StudentJpaRepository repository) {
		super();
		this.repository = repository;
	}*/
	
	
	private StudentDataJPA studatajpa;


	public StudentCommanLineRunner(StudentDataJPA studatajpa) {
		super();
		this.studatajpa = studatajpa;
	}


	@Override
	public void run(String... args) throws Exception {
		studatajpa.save(new Student(101L,"Rahul","Web API"));
		studatajpa.save(new Student(102L,"Shikha","CSE"));
		studatajpa.save(new Student(103L,"Roshan","IT"));
		studatajpa.save(new Student(104L,"Dilip","CSE"));
		studatajpa.deleteById(103L);
		System.out.println(studatajpa.findByCourse("CSE"));
	}

/*
	@Override
	public void run(String... args) throws Exception {
		repository.insert(new Student(101L,"Rahul","Web API"));
		repository.insert(new Student(102L,"Shikha","Web API"));
		repository.insert(new Student(103L,"Siddhartha","Computer Orgnization"));
		System.out.println("Student Data is Found "+repository.findById(102 ));
		repository.delete(103);
	}
*/
}
