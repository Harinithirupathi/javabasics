package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class FirstJDBC1 {
	
	public FirstJDBC1(){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager
					.getConnection("jdbc:mysql://localhost/attendence","root","");
			System.out.println(connection);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		FirstJDBC first = new FirstJDBC();
	}

}
