package com.types;

public class Control {
public static void main(String[] args) {
	Control control=new Control();
//	System.out.println("Is 6 a Perfect number");
	//System.out.println("Is 4 a Multiple of two " );
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
//public boolean isEven(int one) {
//	one==2?true:false;
///}
}

