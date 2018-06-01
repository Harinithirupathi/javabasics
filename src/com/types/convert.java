package com.types;

public class convert {
	public void ConvertTemperature()
	{

	double convert;
	int selection;
	double temp;
	double converts;


	do
	{
	
	System.out.println("convert");
	System.out.println( "Main Menu" );
	System.out.println( "Enter 1 for Fahrenheit to Celsius equivalent " );
	System.out.println( "Enter 2 for Celsius to Fahrenheit equivalent" );
	System.out.println( "3 to Exit\n " );
	System.out.print( "Selection: " );
	public static void main(String[] args) {
		 
		int selection =9;
	

	
	

	switch ( selection )
	{
	case 1:
	System.out.println("Enter fahrenheit temperature: " );
	temp = get.nextInt();
	convert = celsius( temp );
	System.out.printf("%f degrees F = %f degrees C\n",temp,convert );
	break;

	case 2:
	System.out.println("Enter celsius temperature: " );
	temp = get.nextInt();
	converts = fahrenheit( temp );
	System.out.printf("%f degrees C = %f degrees F\n", temp, converts );
	break;

	case 3:
	break;

	default:
	System.out.println( "Invalid selection" );



	} 
	} while( selection != 3);
	} 
	public static double fahrenheit(double celsius)
	{
	double fahrenheit;
	fahrenheit = 9 / 5 * (celsius + 32);

	return fahrenheit;
	}

	public static double celsius(double fahrenheit)
	{
	double celsius;
	celsius = 5 / 9 * (fahrenheit - 32);

	return celsius;
	}

	}


