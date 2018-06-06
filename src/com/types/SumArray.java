package com.types;


	import java.util.ArrayList;
	import java.util.List;

	public class SumArray {	

		public static void main(String args[]) {
			
			ArrayList<String> h = new ArrayList<>();
			
			
			
			
			
			double sum=0;
			for(int i=0;i<args.length;i++) {
				
				sum=sum+Double.parseDouble(args[i]);
			}
		System.out.println("The sum is "+sum);
		}

}
