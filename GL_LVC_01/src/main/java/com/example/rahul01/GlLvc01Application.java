package com.example.rahul01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


public class GlLvc01Application {

	public static void main(String[] args) {
		//Tight Coupling
		Circle c = new Circle(10);
		//Injecting the dependent Object Circle to Drawing 
		Drawing d1 = new Drawing(c);
		d1.draw();
		
	}

}
