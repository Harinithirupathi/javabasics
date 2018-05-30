package com.types;

public class profram {
	public static void main(String[] args) {
		int h=1;
		int a=8;
		outer:for(h=1;h<5;h++) {
		inner:	for(a=8;a<12;a++) {
			if(a ==9) {
				continue outer;
			}
			if(a== 11) {
				continue inner;
			}
			System.out.println("h="+h+" a="+a);
			}
		}
	
		
		}
}
