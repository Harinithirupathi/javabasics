package com.java.currency;

public class Palindrome {
	public static void main(String[] args) {
		Palindrome p=new Palindrome();
		p.isPalindrome("sarav");
	}
public boolean isPalindrome(String input1) {
	
	input1=input1.toLowerCase();
    StringBuilder input=new StringBuilder();
    input.append(input1);
    input.reverse();
    
	
	/*int t=input1.length();
	
	for(int i=(t-1);i>=0;i--){
		r+=input1.charAt(i);
	}*/
    if(input.equals(input1)) {
    	System.out.println("true");
	return true;
    }
    else {
    	System.out.println("f");
    	return false;
    }
	}
	}


