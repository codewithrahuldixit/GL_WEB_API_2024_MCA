package com.example.rahul04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Drawing {
	
	
	//@Autowired
	//It is Used to Inject Object dependent Object 
	//it can be used on Fields 
	//Setter Methods
	private Shape shape;
	// Dependencies are set by Creating the bean using its constructor
	//it is By Default
	
	public Drawing(Shape shape) {
		super();
		this.shape = shape;
	}
	
	
	public void draw() {
		shape.show();
	}


	//@Autowired
	public void setShape(Shape shape) {
		System.out.println("Setter is Executed");
		this.shape = shape;
	}

}
