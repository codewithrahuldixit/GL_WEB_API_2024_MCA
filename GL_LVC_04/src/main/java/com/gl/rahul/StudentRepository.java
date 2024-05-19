package com.gl.rahul;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface StudentRepository extends MongoRepository<Student,Integer>{
	public Student findByName(String name);
}
