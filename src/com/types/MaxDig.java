package com.types;

public class MaxDig {
		public int max(int number) {
			int temp;
			int max=number%10;
			while(number !=0)
			{
				
				number=number/10;
				temp=number%10;
				if(temp>max)
				{
				max=temp;	
				}
				max=max;
			}
			return max;
		}
			
			
		public static void main(String[] args) {
			MaxDig m1=new MaxDig();
			m1.max(987);
		}
	}

