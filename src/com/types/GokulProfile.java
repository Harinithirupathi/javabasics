package com.types;

public class GokulProfile implements IProfile{

	@Override
	public void myBasicInfo() {
		System.out.println(ProfileConstant.FIRST_NAME+"GokulDepan");
		System.out.println(ProfileConstant.FIRST_NAME+"Devarajan");
		System.out.println(    "Age  : 26");
			
		
	}

	@Override
	public void myHobbies() {
		System.out.println("Gd hobby is always chating with sowmi.");
		
		
	}
 

}
