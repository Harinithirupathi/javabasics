package com.types;

public class Laptop {
	    String Model;
	    double rate;
	  public Laptop() {
	}
	  
	  
	  public String getModel() {
		return Model;
	}


	public void setModel(String Model) {
		this.Model = Model;
	}


	public double getrate() {
		return rate;
	}


	public void setrate(double rate) {
		this.rate = rate;
	}


	public boolean start() {
		  return true;
	  }
	  public void power() {
	  }
	public static void main(String[]args) {
	Laptop Laptop1=new Laptop();
	Laptop Laptop2=new Laptop();
Laptop1.rate=74000.0;
Laptop2.rate=89000.0;

	System.out.println(Laptop1.rate);
	System.out.println(Laptop2.rate);
	}
	}


