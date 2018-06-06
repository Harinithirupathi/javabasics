package com.types;

public class Rectangle {
double length;
double width;
public double findPerimeter() {
	return 2*(length+width);
}
public double findArea() {
	return length*width;
}
public double getLength() {
	return length;
}
public void setLength(double length) {
	if(length >0.0 && length <20.0)
	this.length = length;
	else
		System.out.println("Enter number between 0.0 to 20.0");
}
public double getWidth() {
	return width;
}
public void setWidth(double width) {
	if(width >0.0 && width <20.0)
	this.width = width;
	else
		System.out.println("Enter number between 0.0 to 20.0");
}
public static void main(String[] args) {
	Rectangle r=new Rectangle();
	
	r.setLength(10.2);
	r.setWidth(18.1);
	
	System.out.println("Area of rectangle : "+r.findArea());
	System.out.println(" Area of rectangle : "+r.findPerimeter());
	}

}
