package com.example.rahul01;

public class Rectangle {
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
public void show() {
	System.out.println("The length of Rectangle is = "+length);
	System.out.println("The breath of Rectangle is = "+breath);
}
}
