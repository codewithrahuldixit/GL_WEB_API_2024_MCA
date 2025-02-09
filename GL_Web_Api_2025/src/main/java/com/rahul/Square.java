package com.rahul;

public class Square implements Shape  {

	private int side;

	public Square() {
		super();
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
