package com.types;

public class Reverse {
		int a[]= {3,4,5,2,33,24,2};
		public void hari()
		{  
			int i;
			for(i=a.length-1;i>=0;i--)
			{
				System.out.println(a[i]);
			}
		}
		public static void main(String args[]){
			Reverse s=new Reverse();
			s.hari();
		}
	}

