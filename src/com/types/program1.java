package com.types;

public class program1 {
	public static void main(String[] args) {
		int r=0;
		int s=0;
outer:		for(r=0;r<5;r++) {
		
inner:		for(s=0;s<4;s++) {
            if(s==2) {
			
            continue outer;
            }
           if(s==3) {   
        	continue inner;
           }
           System.out.println("r="+r+ "s="+s);
		}
		}
  }
}
