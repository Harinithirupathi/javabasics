package com.types;

public class Invoice {
String partNumber;
String partDescription;
int quantity;
double price;
double totalPrice;
public String getPartNumber() {
	return partNumber;
}
public void setPartNumber(String partNumber) {
	this.partNumber = partNumber;
}
public String getPartDescription() {
	return partDescription;
}
public void setPartDescription(String partDescription) {
	this.partDescription = partDescription;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	if(quantity<0) {
		this.quantity=0;
	}else {
		this.quantity = quantity;	
	}
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	if(price<0) {
		this.price=0.0;
	}else
		this.price = price;	
}
public double getInvoiceAmount(){
	totalPrice=quantity*price;

	 return totalPrice;
}
	public static void main(String[]args) {
		

	Invoice invoice1=new Invoice();

	invoice1.setQuantity(5);
	invoice1.setPrice(400);
	invoice1.setPartDescription("bolt");
	System.out.println(invoice1.getQuantity());
			System.out.println(invoice1.getInvoiceAmount());
			System.out.println(invoice1.getPartDescription());
			System.out.println(invoice1.getPrice());
}
}





