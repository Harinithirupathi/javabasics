package com.types;

public class TestShape {
public static void printShape(Shape shape) {
	shape.Square();
	shape.Rectangle();
	shape.Quadrilateral();
	shape.Sphere();
	
}
public static void main (String args[]) {
    Shape s1=new TwoDimention();
	Shape s2=new ThreeDimention();
	printShape(s1);
	printShape(s2);
	
}
}
