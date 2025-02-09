package com.rahul02;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Rectangle implements Shape {
	private int length;
	private int breath;
	
	public Rectangle() {
	
		super();
		System.out.println("Rectangle Object is Created");
		// TODO Auto-generated constructor stub
	}

	public Rectangle(int length, int breath) {
		super();
		this.length = length;
		this.breath = breath;
	}
	
	public double area() {
		return length*breath;
	}
	
}
