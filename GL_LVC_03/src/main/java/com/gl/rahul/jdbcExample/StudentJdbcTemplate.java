package com.gl.rahul.jdbcExample;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.gl.rahul.bean.Student;

@Repository
public class StudentJdbcTemplate {
	
	private JdbcTemplate springjdbctemplate;
	
	public StudentJdbcTemplate(JdbcTemplate springjdbctemplate) {
		super();
		this.springjdbctemplate = springjdbctemplate;
	}

	private String Insert_Query= """
			insert into STUDENT(id,name,course) values (?,?,?);
			""";

	private String Delete_Query= """
			delete from Student where id = ?;
			""";
	public void insert(Student student) {
		springjdbctemplate.update(Insert_Query,
				student.getId(),student.getName(),student.getCourse());
	}
	public void deleteById(Long id) {		
		springjdbctemplate.update(Delete_Query,
				id);		
	}
	
	

}
