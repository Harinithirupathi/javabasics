package com.types;

public class IsMultiple11 {
		public boolean ismuliple11(int first,int second) {
			return second % first == 0 ?true:false;
		}
		public boolean iseven(int number) {
			
	        return number%2 == 0 ?true:false;
		}
		public  double celsius(double celsius,int fahrenheit) {
			celsius = 5.0 / 9.0 * ( fahrenheit - 32 );
			return celsius;
		}
		public double fahrenheit(double celsius)
		{
			double fahrenheit = 9.0 / 5.0 * (celsius + 32);
			return fahrenheit;
		}
		public boolean isperfect(int numeric)
		{
			int sum=0;
			for(int i=1;i<=(numeric/2);i++)
			{
				sum = sum + ((numeric % i == 0)?i:0);
			}
			return (numeric == sum )?true:false;
		}
		public int reverse(int number ) {
			int value=0,i;
			while(number!=0)
			{
				
				 i=number%10; 
				value=(value*10)+i;
				number=number/10;
			}
		
		return value;
		}
		public static void main(String[] args)
		{
			IsMultiple11 m=new IsMultiple11();
			System.out.println("The given boolean is "+m.iseven(8));
			System.out.println("The given boolean is "+m.ismuliple11(10, 5));
			System.out.println("The Celsius is "+m.celsius(11.1, 12));
			System.out.println("The Fahrenheit is "+m.fahrenheit(33.3));
			System.out.println("The given boolean is "+m.isperfect(7));
			System.out.println("The revers of Number is "+m.reverse(978));
			}

	}



