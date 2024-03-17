package com.example.rahul04;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component
//By Default the scope of the class is Singleton
//Only One Bean Per Spring Context
//@Primary
public class Rectangle implements Shape{
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