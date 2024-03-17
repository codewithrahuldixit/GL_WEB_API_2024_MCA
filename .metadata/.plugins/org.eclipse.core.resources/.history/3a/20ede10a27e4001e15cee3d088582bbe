package com.example.rahul02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


public class GlLvc01Application {

	public static void main(String[] args) {
		//Tight Coupling
		Circle c = new Circle(10);
		Rectangle r = new Rectangle(10,20);
		//Injecting the dependent Object Circle to Drawing 
		Drawing d1 = new Drawing(r);
		d1.draw();
		
	}

}
