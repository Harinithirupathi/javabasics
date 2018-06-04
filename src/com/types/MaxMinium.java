package com.types;

public class MaxMinium {
		int a[]= {1,4,5,6,7,90,100,123,134};
		public void Maximum()
		{   int max=a[0],i;
			for(i=0;i<a.length;i++)
			{
			if(max<a[i])
			{
				max=a[i];
			}
			System.out.println(max);
			System.out.println("Maximum");
		}
		}
		public void Minium()
		{   int min=a[0],j;
			for( j=0;j<a.length;j++)
			{
			if(min>a[j])
			{
				min=a[j];
			}
			
			System.out.println(min);
			System.out.println("Minimum");
			
		}
		}
		public static void main(String args[])
		{
			MaxMinium m=new MaxMinium();
			m.Minium();
			m.Maximum();
		}
		
   
}


















