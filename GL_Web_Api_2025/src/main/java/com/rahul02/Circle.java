package com.rahul02;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@Lazy
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Circle implements Shape {
	private int radius;

	public Circle() {
		super();
		System.out.println("Circle Object is Created");
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
