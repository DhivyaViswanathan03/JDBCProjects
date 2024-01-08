package com.sample.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.sample.jdbc.util.jdbcutil;

public class InsertApp {

	

		public static void main(String[] args) throws SQLException {
			Connection connection=null;
			Statement statement=null;
			ResultSet resultSet=null;
			try {
			
		        connection=jdbcutil.getJdbcConnection();
		        if(connection !=null) {
		        	statement=connection.createStatement();
		        }
		       if(statement !=null) {
		    	   int rowCount=statement.executeUpdate
			        		("insert into song values(37,'helohelo','imman',40)");
			        System.out.println("No of rows affected is:"+rowCount);
			        
			        
		       }
		        
		     } 

			catch(SQLException sql) {
				sql.printStackTrace();
			}catch(Exception e1) {
				e1.printStackTrace();
			}finally {
				jdbcutil.CleanUp(connection, statement, resultSet);
				System.out.println("connection is closed....");
			}
			
	}

}
