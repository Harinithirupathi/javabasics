package com.types;
public class Bus {
	    String model;
	    double speed;
	  public Bus() {
	}
	  
	  
	  public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public double getSpeed() {
		return speed;
	}


	public void setSpeed(double speed) {
		this.speed = speed;
	}


	public boolean start() {
		  return true;
	  }
	  public void accelerate() {
	  }
	  public void changeInt(int i) {
		  i=i+10;  
	  }
	  
	public static void main(String[]args) {
	Bus bus1=new Bus();
	Bus bus2=new Bus();

	bus1.speed=500.0;
    bus2.speed=700.0;
	System.out.println(bus1.speed);
	System.out.println(bus2.speed);
	int race=100;
	bus1.changeInt(race);
	System.out.println(race);
	
	}
}


	
