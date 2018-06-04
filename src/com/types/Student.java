package com.types;

public class Student {
	
		public static void printBioData(BioData bioData) {
			System.out.println(bioData);
		}
	public static void main(String[] args) {
		BioData bioData=new BioData();
		Student  student =new Student();
		bioData.setFirstName("hari");
		bioData.setLastName("thiru");
		bioData.setDept("ece");
		bioData.setBranch("BE");
	
		

}
}