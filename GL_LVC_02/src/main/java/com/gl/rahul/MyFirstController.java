package com.gl.rahul;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstController {
	
	@Autowired
	private Employee emp;
	@RequestMapping("/students")
	public List<Student> getAllStudents() {
		ArrayList<Student> a1 = new ArrayList<>();
		a1.add(new Student(101,"Rahul","CS"));
		a1.add(new Student(102,"Vivek","MCA"));
		a1.add(new Student(103,"Samrthya","Mech"));
		a1.add(new Student(104,"Shristi","Mech"));
		
		return a1;
	}
	@RequestMapping("/employee")
	public Employee getEmployee() {
	return emp;	
	}
	
	
	

}
