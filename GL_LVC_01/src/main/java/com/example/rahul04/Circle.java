package com.example.rahul04;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
/*Indicates that the annotated class is a component.
Such classes are considered as candidates for auto-detectionwhen 
using annotation-based configuration and classpath scanning. 
*/
@Component
//@Primary
@Lazy
public class Circle implements Shape{	
	private int radius;
	
	@PostConstruct
	public void AfterCreation() {
		System.out.println("Initialization Done Here");
	}
	@PreDestroy
	public void BeforeDeallocation() {
		System.out.println("Before Deallocation of Bean");
	}
	public Circle() {
		super();
		// TODO Auto-generated constructor stub
		//System.out.println("Initialization Of Circle Is Done");
	}
	public Circle(int radius) {
		super();
		this.radius = radius;
	}	
	public void show() {
		System.out.println("The radius is = "+radius);
	}

}
