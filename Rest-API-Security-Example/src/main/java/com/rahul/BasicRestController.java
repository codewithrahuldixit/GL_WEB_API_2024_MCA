package com.rahul;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class BasicRestController {
	Logger logger = LoggerFactory.getLogger(getClass());

	@GetMapping("/students")
	public List<Student> getStudent() {
		return List.of(
				new Student(101, "Rahul", "Computer Science"), 
				new Student(102, "Amit", "Computer Science"),
				new Student(103, "Shailja", "Computer Science"), 
				new Student(104, "Rohan", "Computer Science"));
	}

	@PostMapping("/student")
	public String postStudent(@RequestBody Student student) {
		logger.info("The Student Detail as follows " + student);
		return "Succesful";
	}
	
	@GetMapping("/csrf-token")
	public CsrfToken getCsrfToken(HttpServletRequest request) {
		
		return (CsrfToken) request.getAttribute("_csrf");
	}
	
}
