package com.types;

public class Even {
public static void main(String args[] ) {
	Even e1=new Even();
	boolean b=e1.isEven(8);
	System.out.println(b);
}
public static boolean isEven(int one) {
	if(one%2==0) {
		return true;
	}
	else {
		return false;
	}
}
}
