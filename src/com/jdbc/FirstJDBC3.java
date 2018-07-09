package com.jdbc;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class FirstJDBC3{
	
	public FirstJDBC3(){

		public void delete(){
			Connection connection = null;
			Statement statement = null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver"); // load the driver for mysql into JVM
				connection = DriverManager // jdbc:dbproductname://ipaddress:port/dbname
						.getConnection("jdbc:mysql://localhost:3306/attendence","root","");
				System.out.println(connection);
				statement = connection.createStatement();
				String sql = "delete from employee where regNo=5";
				int ret = statement.executeUpdate(sql);
				System.out.println(ret);
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
					if(statement != null)
						statement.close();
					if(connection != null)
						connection.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		}
	}
}
		
		
	
