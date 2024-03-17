package com.example.rahul01;

public class Drawing {
	Circle circle;

	public Drawing(Circle circle) {
		super();
		this.circle = circle;
	}
	public void draw() {
		circle.show();
	}

}
