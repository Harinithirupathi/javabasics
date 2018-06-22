import java.io.*;
import java.util.*;

public class IdentifyPossibleWords {
public static void main(String z[])
{
	Scanner sc=new Scanner(System.in);
String s=sc.next().toLowerCase();
String s1=sc.next().toLowerCase();
String s2[]=s1.split(":");
String s3="";
int count=0;
char a[]=s.toCharArray();
for(int i=0;i<s2.length;i++)
{
	count=0;
	char b[]=s2[i].toCharArray();
	for(int j=0;j<a.length;j++)
	{
		if(a[j]==b[j])
		{
			count=count+1;
			
		}
	}
	if(count==a.length-1)
	{
		s3=s3+" "+s2[i];
	}
}
String s4[]=s3.split(" ");
for(int i=1;i<s4.length;i++)
{
	if(i!=s4.length-1)
	{
		System.out.println(s4[i].toUpperCase()+":");
	}
	else
	{
		System.out.println(s4[i].toUpperCase());
		
		
	}
}

}
}