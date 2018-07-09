package com.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class FirstJDBC2{
	
	public FirstJDBC2(){
		
	}
	public void select(){
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // load the driver for mysql into JVM
			connection = DriverManager // jdbc:dbproductname://ipaddress:port/dbname
					.getConnection("jdbc:mysql://localhost:3306/attendence","root","root");
			System.out.println(connection);
			statement = connection.createStatement();
			String sql = "select * from employee";
			resultSet = statement.executeQuery(sql);
			System.out.println(statement);
			System.out.println(resultSet);
			while(resultSet.next()){
				System.out.print(resultSet.getString("regNo")+" ");
				System.out.print(resultSet.getString("name")+" ");
				
				System.out.print(resultSet.getString("dept")+"\n");
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(resultSet != null)
					resultSet.close();
				if(statement != null)
					statement.close();
				if(connection != null)
					connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public void update(){
		Connection connection = null;
		Statement statement = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // load the driver for mysql into JVM
			connection = DriverManager // jdbc:dbproductname://ipaddress:port/dbname
					.getConnection("jdbc:mysql://localhost:3306/attendence","root","root");
			System.out.println(connection);
			statement = connection.createStatement();
			String sql = "update employee set dept=it where regNo = 5";
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
	
	public void dbMetadata(){
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // load the driver for mysql into JVM
			connection = DriverManager // jdbc:dbproductname://ipaddress:port/dbname
					.getConnection("jdbc:mysql://localhost:3306/attendence","root","root");
			System.out.println(connection);
			DatabaseMetaData  dbMetaData = connection.getMetaData();
			System.out.println(dbMetaData.getDatabaseProductName());
			System.out.println(dbMetaData.getDatabaseProductVersion());
			System.out.println(dbMetaData.getDatabaseMajorVersion());
			System.out.println(dbMetaData.getDatabaseMinorVersion());
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(connection != null)
					connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	public void delete(){
		Connection connection = null;
		Statement statement = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // load the driver for mysql into JVM
			connection = DriverManager // jdbc:dbproductname://ipaddress:port/dbname
					.getConnection("jdbc:mysql://localhost:3306/attendence","root","root");
			System.out.println(connection);
			statement = connection.createStatement();
			String sql = "delete from employee where regNo=6";
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
	public void resultsetMetaData(){
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // load the driver for mysql into JVM
			connection = DriverManager // jdbc:dbproductname://ipaddress:port/dbname
					.getConnection("jdbc:mysql://localhost:3306/attendence","root","root");
			System.out.println(connection);
			statement = connection.createStatement();
			String sql = "select * from employee";
			resultSet = statement.executeQuery(sql);
			System.out.println(statement);
			System.out.println(resultSet);
			ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
			System.out.println(resultSetMetaData.getColumnCount());
			while(resultSet.next()){
				System.out.print(resultSet.getString("regNo")+resultSetMetaData.getColumnName(1)+resultSetMetaData.getColumnType(1)+"   ");
				System.out.print(resultSet.getString("name")+resultSetMetaData.getColumnName(2)+resultSetMetaData.getColumnType(2)+"   ");
				System.out.print(resultSet.getString("dept")+resultSetMetaData.getColumnName(3)+resultSetMetaData.getColumnType(4)+"\n");
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(resultSet != null)
					resultSet.close();
				if(statement != null)
					statement.close();
				if(connection != null)
					connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	public void PrepareStatementExample(){
	    Connection connection = null;
	    PreparedStatement preparedStatement=null;
	    try {
	      Class.forName("com.mysql.cj.jdbc.Driver"); // load the driver for mysql into JVM
	      connection = DriverManager // jdbc:dbproductname://ipaddress:port/dbname
	          .getConnection("jdbc:mysql://localhost:3306/attendence","root","root");
	      System.out.println(connection);
	      String sql="insert into student(RegNo,Name,Dept) values(?,?,?)";
	      preparedStatement=connection.prepareStatement(sql);
	      preparedStatement.setInt(1,11);
	      preparedStatement.setString(2,"isha");
	      preparedStatement.setString(3,"ece");
	      int ret=preparedStatement.executeUpdate();
	      System.out.println(ret);
	    } catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(connection != null)
					connection.close();
				if(preparedStatement !=null)
					preparedStatement.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		FirstJDBC2 first = new FirstJDBC2();
		//first.update();
		//first.delete();
		//first.dbMetadata();
		//first.resultsetMetaData();
		 first.PrepareStatementExample();
	}
}