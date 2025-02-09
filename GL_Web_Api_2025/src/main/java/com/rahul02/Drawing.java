package com.rahul02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Drawing {
	
	@Autowired
	@Qualifier("Square")
	private Shape shape;

//Injecting Object of type Shape Using Constructor
	public Drawing(Shape shape) {
		
		super();
		System.out.println("Drawing Object is Created");
		this.shape = shape;
	}

	public void draw() {
		System.out.print(shape.getClass().getName()+" Area is Printed " );
		System.out.println(shape.area());
	}

	public Shape getShape() {
		return shape;
	}

	//@Autowired
	public void setShape(Shape shape) {
	
		this.shape = shape;
	}

	

}
