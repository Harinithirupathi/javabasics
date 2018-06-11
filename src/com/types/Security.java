package com.types;

public class Security  {
		
	public int findpassword(int a,int b,int c,int d,int e)
	{ 
		int s1=show(a);
		int s2=show(b);
		int s3=show(c);
		int s4=show(d);
		int s5=show(e);
		int s=s1+s2+s3+s4+s5;
		return s;
	}
	public static int show(int x){
	String s=String.valueOf(x);
	String a="";
	int password=0;
	int count=0;
	for(int i=0;i<s.length();i++)
	{
	for(int j=0;j<s.length();j++)
	{
	if(s.charAt(i)==s.charAt(j))
	{ 
	if(i!=j)
	{
		count=1;
	a += s.charAt(i); 
	}
	}
	}
	}
	if(count==0)
	{
		return password;
	}
	else
	{
	}
	if(a.equals(s)==true)
	{ 
	return password;
	}
	else
	{
	password=Integer.parseInt(s);
	return password;
	}
	}


	public static void main(String[] args) {
		Security stable=new Security();
		System.out.println(stable.findpassword(1313,12,122,678,898));
	}
	}





