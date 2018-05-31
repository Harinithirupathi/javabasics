package com.types;

public class BusExample {
public static void main(String[]args) {
	Bus bus=new Bus();
	bus.setSpeed(500);
	BusExample busExample=new BusExample();
	busExample.aMethod(bus);
	System.out.println("speed"+bus.getSpeed());
}
public void aMethod(Bus bus) {
	bus.setSpeed(600);
}
}
