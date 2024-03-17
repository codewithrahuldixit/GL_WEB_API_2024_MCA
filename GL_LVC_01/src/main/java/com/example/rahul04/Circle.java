package com.example.rahul04;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
/*Indicates that the annotated class is a component.
Such classes are considered as candidates for auto-detectionwhen 
using annotation-based configuration and classpath scanning. 
*/
@Component
@Primary
@Lazy
public class Circle implements Shape{	
	private int radius;
	{
		System.out.println("Circle Object is Created");
	}
	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Circle(int radius) {
		super();
		this.radius = radius;
	}	
	public void show() {
		System.out.println("The radius is = "+radius);
	}

}