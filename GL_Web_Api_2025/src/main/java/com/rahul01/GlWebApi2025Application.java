package com.rahul01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GlWebApi2025Application {

	public static void main(String[] args) {
		
		//Launching the Aoolication Context Using Following Object Creation
		//DrawingConfig Class is Responsiple for the creation of object and placed 
		//in the Spring Context
		var context = new AnnotationConfigApplicationContext(DrawingConfig.class);
		var d = context.getBean(Drawing.class);
		d.draw();
	
	}

}
