package com.rahul;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@Autowired
	private CourseConfiguration conf;
	@GetMapping("/course")
	public Course getCourse() {
		return new Course(conf.getId(),conf.getName(),conf.getDepartment());
	}
}
