package com.types;

	 public class SalesPayment {
	static double salary;
	static double commision;
	int [] count= new int [10];
	


	public static double getSalary() {
		return salary;
	}

	public static void setSalary(int salary) {
		SalesPayment.salary = salary;
	}

	public static double getCommision() {
		return commision;
	}

	public static void setCommision(int commision) {
		SalesPayment.commision = commision;
	}

public void calculatePayment(int GS) {
	double newsalary=salary+(GS*(commision/100.0));
	System.out.println(newsalary);
	salary=newsalary;
}

public void setRange(double salary) 
{ 
	
	if((salary>=200) && (salary<300)) 
	{
		System.out.println("a range");
		int oldvalue=count[0];
		int newValue = oldvalue+1;
		count[0]=newValue;
		System.out.println("The SP earned salaries in this ranges"+count[0] );
	
	}
	else if((salary>=300) && (salary<400))
	{
		System.out.println("b range");
		int oldvalue=count[1];
		int newValue = oldvalue+1;
		count[1]=newValue;
		System.out.println("The SP earned salaries in this ranges"+count[1]);
	}
	else if((salary>=400) && (salary<500))
	{
			System.out.println("c range");
			int oldvalue=count[2];
			int newValue = oldvalue+1;
			count[2]=newValue;
			System.out.println("The SP earned salaries in this ranges"+count[2]);
	}
	else if((salary>=500) && (salary<600))
	{
				System.out.println("d range");
				int oldvalue=count[3];
				int newValue = oldvalue+1;
				count[3]=newValue;
				System.out.println("The SP earned salaries in this ranges"+count[3]);
	}
	else if((salary>=600) && (salary<700))
	{
				System.out.println("e range");
				int oldvalue=count[4];
				int newValue = oldvalue+1;
				count[4]=newValue;
				System.out.println("The SP earned salaries in this ranges"+count[4]);
	}
	else if((salary>=700) && (salary<800))
	{
					System.out.println("f range");
					int oldvalue=count[5];
					int newValue = oldvalue+1;
					count[5]=newValue;
					System.out.println("The SP earned salaries in this ranges"+count[5]);
	}
	else if((salary>=800) && (salary<900))
	{
						System.out.println("g range");
						int oldvalue=count[6];
						int newValue = oldvalue+1;
						count[6]=newValue;
						System.out.println("The SP earned salaries in this ranges"+count[6]);
	}
	else if((salary>=900) && (salary<1000))
	{
					System.out.println("h range");
					int oldvalue=count[7];
					int newValue = oldvalue+1;
					count[7]=newValue;
					System.out.println("The SP earned salaries in this ranges"+count[7]);
	}
	else if(salary>1000) 
	{
					System.out.println("i range");
					int oldvalue=count[8];
					int newValue = oldvalue+1;
					count[8]=newValue;
					System.out.println("The SP earned salaries in this ranges"+count[8]);
	}
	else 
	{
		System.out.println("out of range");
		int oldvalue=count[9];
		int newValue = oldvalue+1;
		count[9]=newValue;
		System.out.println("The SP earned salaries in this ranges"+count[9]);
	}
} 
public static void main(String[] args) {
	
	SalesPayment payment1=new SalesPayment();
	SalesPayment.setSalary(200);
	SalesPayment.setCommision(9);
	payment1.calculatePayment(5000);
	payment1.setRange( salary);
	
}
}



