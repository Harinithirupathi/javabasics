package com.types;

public class TestPro {
public static void printProfile(IProfile profile) {
	
	profile.myBasicInfo();
    profile.myHobbies();
}
public static void main(String args[]) {
IProfile myProfile1=new HariProfile();
IProfile myProfile2=new GokulProfile();
printProfile(myProfile1);
printProfile(myProfile2);
}
}
