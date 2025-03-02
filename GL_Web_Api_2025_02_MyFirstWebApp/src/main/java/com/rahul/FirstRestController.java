package com.rahul;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstRestController {

	@Autowired
	public Person person;
	@RequestMapping("/hello")
	public String helloUser() {
		return "Hello User";
	}
	
	@RequestMapping("/students")
	public List<Student> getStudent(){
		ArrayList<Student> a1 = new ArrayList<>();
		a1.add(new Student(101,"Rahul"));
		a1.add(new Student(102,"Vivek"));
		a1.add(new Student(103,"Shaillesh"));
		
		return a1;
	}
	
	@RequestMapping("/person")
	public Person getPerson(){
		return person;
	}
	
}
