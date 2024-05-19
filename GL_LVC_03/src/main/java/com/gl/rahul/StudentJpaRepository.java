package com.gl.rahul;

import org.springframework.stereotype.Repository;

import com.gl.rahul.bean.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class StudentJpaRepository {

	
	private EntityManager entityManager;
	
	public StudentJpaRepository(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}
	public void insert(Student student) {
		entityManager.merge(student);
	}
	public Student findById(long id) {
		return entityManager.find(Student.class,id);
	}
	
	public void delete(long id) {
		Student student = findById(id);
		entityManager.remove(student);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
