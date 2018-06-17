package com.java.currency;

public class ThreadExample extends Thread {
	String name;
	
public ThreadExample(String name) {
	this.name=name;
	setName(name);
	start();
}

@Override
public void run() {
for(int i=0;i<10;i++) {
	System.out.println(name +" = "+i);
	try{
		Thread.sleep(50);
}catch (InterruptedException e) {
	e.printStackTrace();
}
}
}
public static void main(String[]args) {
	ThreadExample one =new ThreadExample("one");
	ThreadExample two =new ThreadExample("two");
	System.out.println("Main Done"+Thread.currentThread());
}



}
}