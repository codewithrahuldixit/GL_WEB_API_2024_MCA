package com.rahul01;

import org.springframework.context.annotation.Bean;

//Responsible to Manage the Objects Using Spring 


public class DrawingConfig {

	@Bean
	public Circle getCircle() {
		return new Circle(10);
	}
	@Bean
	public Rectangle getRectangle () {
		return new Rectangle(10,20);
	}
	
	//Parameter Wiring 
	@Bean
	public Drawing getDrawing(Circle circle) {
		return new Drawing(circle);
	}
	
}
