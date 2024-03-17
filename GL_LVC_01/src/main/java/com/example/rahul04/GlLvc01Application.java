package com.example.rahul04;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class GlLvc01Application {

	public static void main(String[] args) {

		var context = new AnnotationConfigApplicationContext(GlLvc01Application.class);
		System.out.println("Before The Drawing Object Used");
		var v = context.getBean(Drawing.class);
		v.draw();
	}

}
