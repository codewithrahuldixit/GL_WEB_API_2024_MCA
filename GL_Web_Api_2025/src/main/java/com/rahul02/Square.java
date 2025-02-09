package com.rahul02;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Qualifier("Square")
@Component
@Lazy
public class Square implements Shape  {

	private int side;

	public Square() {
		super();
		System.out.println("Square Object is Created ");
		// TODO Auto-generated constructor stub
	}

	public Square(int side) {
		super();
		this.side = side;
	}
	
	public double area() {
		return side * side;
	}
}
