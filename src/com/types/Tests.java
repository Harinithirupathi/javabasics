package com.types;
import java.util.Scanner;

public class Tests {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first input String");
		String input1=sc.next();
		System.out.print("Enter second input String");
		String input2=sc.next();
		System.out.print("Enter third input String");
		String input3=sc.next();
		
		
		String[] str1 = divideString(input1);
		String[] str2 = divideString(input2);
		String[] str3 = divideString(input3);
		
		String in1 =str1[0]+str1[1]+ str1[2];
		String in2 =str2[0]+str2[1]+ str2[2];
		String in3 = str3[0]+str3[1]+ str3[2];
		
		String fstr1=toggleString(in1);
		String fstr2=toggleString(in2);
		String fstr3=toggleString(in3);
		
		
		System.out.println(fstr1);
		System.out.println(fstr2);
		System.out.println(fstr3);
		
	}

	public static String[] divideString(String input) {
		int rem = input.length() % 3;
		int div = input.length() / 3;
		String first = null;
		String middle = null;
		String last = null;
		if (rem == 1) {
			first = input.substring(0, div);
			middle = input.substring(first.length(), first.length() + div + rem);
			last = input.substring(first.length() + middle.length(), input.length());
		}

		if (rem == 2) {
			first = input.substring(0, div + 1);
			middle = input.substring(first.length(), first.length() + div);
			last = input.substring(first.length() + middle.length(), input.length());
		}
		if (rem == 0) {
			first = input.substring(0, div);
			middle = input.substring(first.length(), first.length() + div);
			last = input.substring(first.length() + middle.length(), input.length());

		}
		return new String[] { first, middle, last };
	}

	public static String toggleString(String str) {
		char[] ch = str.toCharArray();
		String s="";
		for (int i = 0; i < ch.length; i++) {
			if (Character.isLowerCase(ch[i])) {
				s=s+Character.toUpperCase(ch[i]);
			}
			if (Character.isUpperCase(ch[i])) {
				s=s+Character.toLowerCase(ch[i]);
			}
		}
		return s;
		
	}
}




