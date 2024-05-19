package com.gl.rahul;

import java.net.URI;
import java.util.List;
import java.util.NoSuchElementException;

import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import jakarta.servlet.Servlet;

@RestController
public class StudentController {
	
	private StudentRepository repository;
	
	public StudentController(StudentRepository repository) {
		super();
		this.repository = repository;
	}

	@GetMapping("/students")
	public List<Student> getAllStudents() {		
		return repository.findAll();		
	}
	@GetMapping("/students/{id}")
	public Student getStudentByid(@PathVariable int id) {		
		Student student;
		try {
		student = repository.findById(id).get();	
		}
		catch(NoSuchElementException ex) {
			throw new UserNotFoundException("Id :"+id);
		}
		return student;
	}
	@PostMapping("/students")
	public ResponseEntity<Object> storeStudent(@RequestBody Student student) {
		repository.save(student);
		//students/
		URI location =  ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(student.getId())
				.toUri();
		return ResponseEntity.created(location).build();
	}
	
	@DeleteMapping("/students/{id}")
	public void storeStudent(@PathVariable int id) {
				repository.deleteById(id);
	}
	
	@GetMapping("/students/name/{name}")
	public Student getStudentByName(@PathVariable String name) {		
		Student student;
		try {
		student = repository.findByName(name);
		}
		catch(NoSuchElementException ex) {
			throw new UserNotFoundException("name :"+name);
		}
		return student;
	}

}
