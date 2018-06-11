package com.types;

public class Test extends Animals {
	public static void main(String[] args) {
		Animals a;
		a=new Dog();
		a.eat();
		a=new Cat();
		a.eat();
	}

}
