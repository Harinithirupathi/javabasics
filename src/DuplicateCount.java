import java .io.*;
import java.util.*;

public class DuplicateCount {
public static void main(String z[]) {
	Scanner sc=new Scanner (System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	int i;
	int j;
	for(i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	int count=1;
	String s="";
	for(i=0;i<n;i++)
	{
	for(j=i+1;j<n;j++)
	{
		if(a[i]==a[j])
		{
			s=String.valueOf(a[i]);
			count++;
		}
	}
	if(count!=1)
	{
			System.out.println(s+" "+count);
			break;
	}
}
if(count==1)
{
	System.out.println("NODUPLICATEELEMENT");
	
		}
	}
}

