package com.types;

	import java.io.*;
	import java.util.*;
	public class Password {

	public static void main(String ar[])
	{
	Scanner scanner=new Scanner(System.in);
	int n=scanner.nextInt();
	int sum=0;
	int inp[]=new int[n];

	for(int m=0;m<n;m++)
	{
	inp[m]=scanner.nextInt();
	}
	int dig[]=new int[10];
	int un=0,st=0;
	//char c[];
	String r=" ";
	String rstring="";
	String ustring="";
	TreeSet<Integer> tr=new TreeSet<Integer>();
	for(int i=0;i<inp.length;i++)
	{
	r=String.valueOf(inp[i]);
	char c[]=r.toCharArray();
	int narr[]=new int[c.length];
	for(int j=0;j<c.length;j++)
	{
	narr[j]=Integer.parseInt(String.valueOf(c[j]));
	}
	for( int k=0;k<narr.length;k++)
	{
	dig[narr[k]]=(dig[narr[k]])+1;
	}
	for(int p=0;p<10;p++)
	{
	if(dig[p]!=0)
	{
	tr.add(dig[p]);
	}
	}
	if(tr.size()>1)
	{
	un=un+1;
	ustring+=r+" ";
	}
	else
	{
	st=st+1;
	rstring+=r+" ";
	}
	for(int o=0;o<10;o++)
	{
	dig[o]=0;
	}
	tr.clear();
	}
	String uarray[]=ustring.split(" ");
	int unum[]=new int[uarray.length];
	for( int t=0;t<uarray.length;t++)
	{
	Integer.parseInt(String.valueOf(uarray[t]));
	unum[t]=Integer.parseInt(String.valueOf(uarray[t]));
	sum=sum+unum[t];
	}
	System.out.println(sum);
	}
}
