package com.lang;

import java.util.Scanner;

public class Encoder {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first input String");
        String input1=sc.next();
        System.out.println("Enter second input String");
        String input2=sc.next();
        System.out.println("Enter third input String");
        String input3=sc.next();
        String[] str1=divideString(input1);
        String[] str2=divideString(input2);
        String[] str3=divideString(input3);
        String in1=str1[0]+str2[1]+str3[2];
        String in2=str1[1]+str2[2]+str3[0];
        String in3=str1[2]+str2[1]+str3[0];
        System.out.println(in1);
        System.out.println(in2);
        System.out.println(in3);
        String s3= toogleString(in3);
        System.out.println(s3);
    }
        public static String[] divideString(String input){
            int r=input.length()%3;
            int n=input.length()/3;
            String first =null;
            String middle=null;
            String last=null;
       
       
   
            if(r==0) {
                first=input.substring(0,n);
                middle=input.substring(first.length(),first.length()+n);
                last=input.substring(first.length()+n,input.length());
                }
            if(r==1) {
                first=input.substring(0,n);
                middle=input.substring(first.length(),first.length()+n+r);
                last=input.substring(first.length()+n+r,input.length());
               
               
            }
            if(r==2) {
               
                first=input.substring(0,n+1);
                middle=input.substring(first.length(),first.length()+n);
                last=input.substring(first.length()+n,input.length());
            }
       
       
       
   
            return new String[] {first,middle,last} ;
       

 
}
public static String toogleString(String in3) {
    char[] ch=in3.toCharArray();
    String s="";
    for(int i=0;i<ch.length;i++) {
        if(Character.isLowerCase(ch[i])) {
        s=s+Character.toUpperCase(ch[i]);
        }
        if(Character.isUpperCase(ch[i])) {
            s=s+Character.toLowerCase(ch[i]);
        }
    }
    return s;
}
}


