package com.rahul;

public class GlWebApi2025Application {

	public static void main(String[] args) {
		
		//Circle Object
		//var shape = new Circle(10);
		var shape = new Square(50);//Creating The Object
		//var shape = new Rectangle(10,20);
		//Injecting Object + Wiring the Object into other 
		var d = new Drawing (shape);
		//We Are Drawing the Shape 
		d.draw();
	}

}
