package com.gl.rahul;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
	
	
	private StudentDao dao;
	
	public DemoRestController(StudentDao dao) {
		super();
		this.dao = dao;
		dao.save(new Student(1,"Rahul","Delhi"));
		dao.save(new Student(2,"Shikha","Noida"));
		dao.save(new Student(3,"Atul","Hydrabad"));
		dao.save(new Student(4,"Rakesh","Varanasi"));
		
	}
	@GetMapping("/student")
	public Student helloStudent() {
		return new Student(101,"Rahul","Delhi");
	}
	@GetMapping(path = "/students/{id}")
	public Student getById(@PathVariable int id) {
		Student student;
		
		try {
		student = dao.findById(id).get();
		}
		catch(NoSuchElementException ex) {
			throw new UserNotFoundException("Id --------->"+id);
		}
		return student;
	}
	@GetMapping(path = "/students")
	public List<Student> getAll() {
		return dao.findAll();	
	}
	@PostMapping(path = "/students")
	public ResponseEntity<Student> insertRecord(@RequestBody Student student) {
		dao.save(student);
		return ResponseEntity.created(null).build();
	}
	@DeleteMapping(path = "/students/{id}")
	public void deleteRecord(@PathVariable int id) {
		dao.deleteById(id);
	}

}
