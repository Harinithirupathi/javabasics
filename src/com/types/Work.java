package com.types;
class Employee{
	String firstname;
	String lastName;
	double monthlySalary;
	Employee(){
		
	}
	
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getMonthlySalary() {
		return monthlySalary*12;
	}

	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
}
	public class Work {
public static void main(String[] args) {
	Employee e1=new Employee();
	e1.setFirstname("Harini");
	e1.setLastName("thirupathi");
	int n=45000;
			if(n>0)
			{
	        e1.setMonthlySalary(n);
			}
	Employee e2=new Employee();
			
	e2.setFirstname("suurya");
	e2.setLastName("senthil kumar");
	e2.setMonthlySalary(55000);
	
	System.out.println(e1.getMonthlySalary());
	


}
}