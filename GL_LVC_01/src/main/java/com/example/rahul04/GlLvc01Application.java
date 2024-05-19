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
		
		//We Not Used a Objects Circle Or Rectangle
		//var v = context.getBean(Drawing.class);
		//v.draw();
		System.out.println(context.getBean(Circle.class));
	/*	System.out.println(context.getBean(Circle.class));
		System.out.println(context.getBean(Circle.class));
		System.out.println(context.getBean(Circle.class));
		System.out.println(context.getBean(Rectangle.class));
		System.out.println(context.getBean(Rectangle.class));
		System.out.println(context.getBean(Rectangle.class));
		System.out.println(context.getBean(Rectangle.class));
		System.out.println(context.getBean(Rectangle.class));*/
	}

}
