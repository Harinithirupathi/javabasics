import java.io.*;
import java.util.*;

public class SpecialString {
public static void main(String z[]) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	String s1[]=s.split(" ");
	int n=s1.length;
	String s2=" ";
	int count=0;
	int count1=0;
	int i;
	int m;
	int j=0;
	for(i=0;i<n;i++)
	{
		m=s1[i].length();
		if(m==2||m==3)
		{
			count++;
			
		}
		else if(m%2!=0&&m%3!=0)
		{
			count++;
		}
	}
	for(i=0;i<n;i++)
	{
		s2=s1[i];
		if(i%2!=0&&Character.isUpperCase(s2.charAt(j)))
		{
			count1++;
		}
		s2="";
	}
	if(count==n&&count1==n)
	{
		System.out.println("speciaL");
	}
	else
	{
		System.out.println("NotSpeciaL");
	
		}
	}
}

