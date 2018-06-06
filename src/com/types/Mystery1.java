package com.types;

public class Mystery1 {

		public static void main( String[] args )
		{
		int y;
		int x=1;
		int total=0;

		 while ( x <= 10 )
		 {
		 y = x * x;
		 System.out.println( y );
		 total += y;
		 ++x;
		 } // end while

		System.out.println( total);
		 } // end main
		 

	}

