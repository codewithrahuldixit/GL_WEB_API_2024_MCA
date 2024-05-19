package com.gl.rahul;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gl.rahul.bean.Student;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface StudentDataJPA  extends JpaRepository<Student, Long>{
	List <Student> findByCourse(String course);
}
