package com.rahul;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleHelloWorld {

	@GetMapping("/hello")
	public String hello() {
		return "Hello World";
	}
	@PostMapping("/hello-post")
	public String helloPost() {
		return "Hello World";
	}
}
