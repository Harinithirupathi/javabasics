package com.types;

public class ThreeDimention extends Shape {

	@Override
	public void Quadrilateral() {
		int area,perimeter,a=3,b=4,c=5,d=7;
		area=a=b=c=d/2;
		perimeter=a*b+b*c+c*d+d*a;
		
		System.out.println(area);
		System.out.println(perimeter);
	}

	@Override
	public void Sphere() {
		
		double area,r=10;
		area=4*3.14*r*r;
		System.out.println(area);
		
	}

}
