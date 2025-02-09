package com.rahul01;

public class Drawing {
	
	private Shape shape;

	public Drawing(Shape shape) {
		super();
		this.shape = shape;
	}

	public void draw() {
	
		System.out.println(shape.area());
	}

	

}
