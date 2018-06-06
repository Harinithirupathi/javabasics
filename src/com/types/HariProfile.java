package com.types;

public  class HariProfile implements IProfile{

	@Override
	public void myBasicInfo() {
	System.out.println(ProfileConstant.FIRST_NAME+"Hari");
	System.out.println(ProfileConstant.LAST_NAME+"Thiru");
	System.out.println(    "Age  : 21");
		
	}

	@Override
	public void myHobbies() {
		System.out.println("my hobbies  are doing paper craft.");
		
	}
	

		
	}


