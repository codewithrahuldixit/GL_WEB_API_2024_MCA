package com.rahul;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

	private StudentRepository repository;
	
	public StudentService(StudentRepository repository) {
		super();
		this.repository = repository;
		repository.save(new Student(101,"Rahul","rahul@gmail.com"));
		repository.save(new Student(102,"Shikha","shikha@gmail.com"));
		repository.save(new Student(103,"Atul","atul@gmail.com"));
		repository.save(new Student(104,"Janvi","janvi@gmail.com"));
	}

	public List<Student> getAllStudent(){
		System.out.println("Comming From Repository");
		List<Student> students = repository.findAll();
		System.out.println(students);
		return students;
	}

	public void saveStudent(Student student) {
		repository.save(student);		
	}

	public Student getStudentById(int id) {
		
		return repository.findById(id).get();
	}

	public void deleteStudentById(int id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}
}
