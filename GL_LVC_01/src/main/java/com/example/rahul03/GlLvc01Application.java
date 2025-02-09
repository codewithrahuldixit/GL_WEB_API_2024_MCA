package com.example.rahul03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class GlLvc01Application {

	public static void main(String[] args) {
		
		var context = new AnnotationConfigApplicationContext(DrawingConfig.class);
		var v = context.getBean(Drawing.class);
		v.draw();
	}

}
