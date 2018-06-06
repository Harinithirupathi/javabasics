package com.types;

public class TwoDimention extends Shape{
	
	@Override
	public void Square() {
		int area,perimeter,side=6;
		area=side*side;
		perimeter=4*side;
		System.out.println(area);
		System.out.println(perimeter);
	}

	@Override
	public void Rectangle() {
		int area,perimeter,length=4,width=5;
		area=length*width;
		perimeter=2*(length+width);
		System.out.println(area);
		System.out.println(perimeter);
	}

	{
}

}
