package com.example.rahul04;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//By Default the scope of the class is Singleton
//Only One Bean Per Spring Context
@Primary
@Lazy
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Rectangle implements Shape{
private int length;
private int breath;
public Rectangle() {
	super();
	// TODO Auto-generated constructor stub
	System.out.println("Initialization of Rectangle is Done");
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
