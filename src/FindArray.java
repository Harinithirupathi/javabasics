import java.io.*;
import java.util.*;

public class FindArray {
public static int output1;
public static int output2;
public void findCorrectArray(int[]input1) {
	int n=input1.length;
	int a[]=new int[n];
	a[n-1]=input1[n-1];
	int i;
	for(i=n-2;i>=0;i--)
	{
	a[i]=a[i+1]-input1[i];	
	}
	output1=a[0];
	int m=0;
	for(i=0;i<a.length;i++) {
		m=m+a[i];	
	}
	output2=m;
}
}
public class 
{	
public static void main(String s[]) {
	int input1[]=new int[s.length];
	int i;
	FindArray f=new FindArray();
	for( i=0;i<s.length;i++)
	{
		input1[i]=Integer.parseInt(s[i]);
}
	f.findCorrectArray(input1);
	System.out.println(FindArray.output1);
	System.out.println(" "+FindArray.output2);
}
}