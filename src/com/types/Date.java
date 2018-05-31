package com.types;

public class Date {
static int day;
static int year;
static int month;
	

public Date(int day,int year,int month) {
	this.day=day;
	this.year=year;
	this.month=month;
	
}
public int getDay() {
	return day;
}
public void setDay(int day) {
	this.day = day;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public int getMonth() {
	return month;
}
public void setMonth(int month) {
	this.month = month;
}

	


public static void main(String[] args) {
Date d1=new Date(day,month,year);
d1.setDay(31);
d1.setMonth(5);
d1.setYear(2018);


System.out.println(day+"/"+month+"/"+year);

}}