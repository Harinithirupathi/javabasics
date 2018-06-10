package com.types;
public class Clone implements Cloneable {
public Clone() {
}
public static void main(String []args) {
	try {
	Clone cloneOne =new Clone();
	Clone cloneTwo = (Clone)cloneOne.clone();
	System.out.println(cloneOne.hashCode() +"==="+cloneTwo.hashCode());
}catch(Exception e) {
	e.printStackTrace();
}
}
}
