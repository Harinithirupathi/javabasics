package com.types;

public class Date {
int day;
int year;
int month;
public void data(int day,int year,int month) {
	this.day=day;
	this.year=month;
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

public void displayDate() {
	System.out.println(day+"/"+month+"/"+year);
}
}