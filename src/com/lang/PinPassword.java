package com.lang;
import java.util.Scanner;
public class PinPassword {
	
	
	public static void main(String args[]) {
	     Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the guest name:");
	        String lastName=sc.next();
	        System.out.println("Enter the roomNo:");
	        int room=sc.nextInt();
	        PinPassword p=new PinPassword();
	        p.createWifiPin(room,lastName);
	        System.out.println();
	}
	public static void createWifiPin(int roomNo, String lastName) {
	    int hundreds=0;
	    int tens=0;
	    int units=0;
	    if((roomNo>99)&&(roomNo<=999)) {
	        hundreds=roomNo%100;
	        tens=hundreds/10;
	        units=roomNo%10;
	    }
	    System.out.println(tens);
	    System.out.println(units);
	       Scanner s=new Scanner(System.in);
	       String str=new String(lastName);
	       char name=  str.charAt(str.length() - 1);
	       int n,sum=0;
	        while(roomNo>0) {
	            n=roomNo%10;
	            sum=sum+n;
	            roomNo=roomNo/10;
	        }
	    System.out.println(sum);
	    char sp=0;
	    switch(units) {
	    case 1:
	        if(units==1) {
	            sp='!';
	            break;
	        }
	    case 2:
	        if(units==2) {
	            sp='@';
	            break;
	        }
	    case 3:
	        if(units==3) {
	            sp='#';
	            break;
	        }
	    case 4:
	        if(units==4) {
	            sp='$';
	            break;
	        }
	    case 5:
	        if(units==5) {
	            sp='%';
	            break;
	        }
	    case 6:
	        if(units==6) {
	            sp='^';
	            break;
	        }
	    case 7:
	        if(units==7) {
	            sp='&';
	            break;
	        }
	    case 8:
	        if(units==8) {
	            sp='*';
	            break;
	        }
	    case 9:
	        if(units==9) {
	            sp='(';
	            break;
	        }
	    case 10:
	        if(units==0) {
	            sp=')';
	            break;
	        }
	        }
	    System.out.println("password:"+sum+sp+name+tens);
	    }
	}


