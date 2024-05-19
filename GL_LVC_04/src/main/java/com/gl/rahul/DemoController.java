package com.gl.rahul;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@RequestMapping(method = RequestMethod.GET,path = "/hello")
	public String sayHello() {
		return "Hello User";
	}
	@GetMapping(path = "/student")
	public Student getStudent() {
		return new Student(101,"Gyan","Manipur");
	}
}
