package com.types;

public class Rec {
int side;
double length;
double breadth;
public Rec(int side) {
	this.side=side;
	
}
public Rec(double length,double breadth) {
	if((length>0.0 && length<20.0) &&( breadth>0.0 && breadth<20.0) ){
		this.length=length;
		this.breadth=breadth;
	}else
	{
		System.out.println("sorry");
	
}
}
public double findRectangular() {
	return length*breadth;
}
public static void main(String args[]) {
	Rec rectangle=new Rec(55,6);
	System.out.println(rectangle.findRectangular());
	
}
}