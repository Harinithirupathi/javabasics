package com.types;

class Market {
public void details() {
	System.out.println("Market");
}
}
class Product extends Market {

@Override
public void details() {
	// TODO Auto-generated method stub
	//super.details();
	System.out.println("laptop");
}
}

 class QualityProduct {
	 public static void main (String[]arg) {
			Product p=new Product();
			p.details();
			
		}
	}