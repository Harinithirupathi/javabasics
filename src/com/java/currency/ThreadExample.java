package com.java.currency;

public class ThreadExample extends Thread {
	String name;
	
public ThreadExample(String name) {
	this.name=name;
	start();
}

@Override
public void run() {
for(int i=0;i<10;i++) {
	System.out.println(name +" = "+i);
}

}
public static void main(String[]args) {
	ThreadExample one =new ThreadExample("one");
	ThreadExample two =new ThreadExample("two");
	System.out.println("Main Done");
}



}
}