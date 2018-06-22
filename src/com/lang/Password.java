package com.lang;
import java.io.*;
import java.util.*;

public class Password {
public static void main(String args[]) {
	Scanner sc=new Scanner (System.in);
	int n=sc.nextInt();
	String s=sc.nextLine();
	String s2="";
	int m=(n%9==0)?9:(n%9);
	s2=s2+String.valueOf(m);
	String s1=")!@#$%^&*(";
	int k=n%10;
	s2=s2+s1.charAt(k);
	s2=s2+s1.charAt(s.length()-1);
	n=n/10;
	int p=n%10;
	s2=s2+String.valueOf(p);
	System.out.print(s2);
		
}
}
