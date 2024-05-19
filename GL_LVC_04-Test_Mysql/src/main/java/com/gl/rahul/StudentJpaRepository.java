package com.gl.rahul;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface StudentJpaRepository extends JpaRepository<Student, Integer> {

}
