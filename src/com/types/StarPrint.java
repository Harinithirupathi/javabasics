package com.types;

public class StarPrint {
public static void main(String args []){
int i=1,j=1,n=1,s=1;
n=10;
System.out.println("Number of line");

s=n-1;
for(i=1;i<=n;i++)
{
for(j=1;j<=s;j++)
{
	System.out.println("n has increase ");
  s--;
}
	for(j=1;j<=2*(i-1);j++) 
	{
	System.out.println("*");
	}
	System.out.println("Not print ");
}
for(i=1;i<=n-1;i++)
{
for(j=1;j<=s;j++)
{
	System.out.println(" ");
    s++;
}

for(j=1;j<=2*(n-i)-1;j++) 
{
    System.out.println("*");

{
    System.out.println("not1 print ");
}

}
}
}
}

