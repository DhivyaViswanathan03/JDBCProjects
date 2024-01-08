package com.sample.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.sample.jdbc.util.jdbcutil;

public class InsertAppValuesDynamic {

	

		public static void main(String[] args) throws SQLException {
			Connection connection=null;
			Statement statement=null;
			ResultSet resultSet=null;
			try {
				 Scanner input=new Scanner(System.in);
			       System.out.println("enter songname");
			       String songName=input.nextLine();
			       System.out.println("enter singer");
			       String singer=input.nextLine();
			       System.out.println("enter age");
			       int age=input.nextInt();
		        connection=jdbcutil.getJdbcConnection();
		        if(connection!=null) {
		        	statement=connection.createStatement();
		        }
		        String insertQuery=String.format("insert into song(`songname`,`singer`,`age`) values('%s','%s',%d)", songName,singer,age);
		        System.out.println(insertQuery);
		        if(statement!=null) {
		        	 int rowCount=statement.executeUpdate(insertQuery);
		        	 System.out.println("No of rows affected is:"+rowCount);
		        }
		            

			} 

			catch(SQLException sql) {
				sql.printStackTrace();
			}catch(Exception e1) {
				e1.printStackTrace();
			}finally {
				connection.close();
				System.out.println("connection is closed....");
			}
			
	}

}
