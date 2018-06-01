package com.types;

public class Control {
public static void main(String[] args) {
	Control control=new Control();
	boolean b=control.isMultiple(6,5);
	System.out.println(b);
	}
public static  boolean isMultiple(int one,int two) {
	if(two%one==0) {
		return true;
	}
	else {
		return false;
	}
}
}

