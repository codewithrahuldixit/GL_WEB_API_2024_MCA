package com.rahul02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration
public class GlWebApi2025Application {


	public static void main(String[] args) {
		
		//Launching the Application Context Using Following Object Creation
		//DrawingConfig Class is Responsible for the creation of object and placed 
		//in the Spring Context
		var context = new AnnotationConfigApplicationContext(GlWebApi2025Application.class);
		var d = context.getBean(Circle.class);
		System.out.println(d.hashCode());	
		d = context.getBean(Circle.class);
		System.out.println(d.hashCode());	
		d = context.getBean(Circle.class);
		System.out.println(d.hashCode());	
		d = context.getBean(Circle.class);
		System.out.println(d.hashCode());	
	}

}
