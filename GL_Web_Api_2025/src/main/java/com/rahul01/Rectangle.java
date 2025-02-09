package com.rahul01;

public class Rectangle implements Shape {
	private int length;
	private int breath;
	
	public Rectangle() {
		super();
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
