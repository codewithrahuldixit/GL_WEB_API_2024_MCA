package com.example.rahul03;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//Configuration file where we Describe what to perform
@Configuration
public class DrawingConfig {
	//Responsible to create circle Object
	@Bean
	@Primary
	public Circle getCircle() {
		return new Circle();
	}
	
	//Responsible to create Rectangle Object
	@Bean
	public Rectangle getRectangle() {
		return new Rectangle();
	}
	
	@Bean
	public Drawing getDrawing(Shape shape) {
		//02 : Inject the Dependent Object By Using Parameters
		// If Multiple Dependent Beans are available use @Primary
		return new Drawing(shape);
		
		//01:Injecting Dependent Object By Calling Member Method getRectangle
		//return new Drawing(getRectangle());
		
	}
	

}
