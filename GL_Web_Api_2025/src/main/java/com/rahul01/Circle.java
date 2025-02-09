package com.rahul01;

public class Circle implements Shape {
	private int radius;

	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	public double area() {
		return 3.14 * radius * radius;
	}

}
