package com.types;

public class race {


    String model;
    double speed;
  public race() {
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
public static void main(String[]args) {
car car1=new car();
car car2=new car();

car1.speed=200.0;
car2 .speed=300.0;
System.out.println(car1.speed);
System.out.println(car2.speed);
}
}
