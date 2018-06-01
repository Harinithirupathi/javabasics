package com.types;

public class Arrnum {
public static void main (String[]args) {
	
	int N=1234,h;
	
	 int arr[]=new int [10];
	 h=0;
	while(N>0) {
		int a=N%10;
		N=N/10;
		arr[h]=a;
		h++;
		
	}
	for(h=0;h<10;h++) {
		System.out.print(arr[h]+",");
	}
	
}

}
