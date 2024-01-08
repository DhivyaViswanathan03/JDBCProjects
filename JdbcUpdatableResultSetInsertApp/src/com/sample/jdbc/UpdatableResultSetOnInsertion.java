package com.sample.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;
import java.util.Scanner;

import com.sample.jdbc.util.jdbcutil;

public class UpdatableResultSetOnInsertion {

	

		public static void main(String[] args) throws SQLException {
			Connection connection=null;
			Statement statement=null;
			ResultSet resultSet=null;
			
			try {
				connection=jdbcutil.getJdbcConnection();
				if (connection != null) {
					statement=
							connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
				}
				if(statement!=null) 
					
					resultSet=statement.executeQuery("select * from products");
					
					if(resultSet!=null) {
						
						System.out.println("Before Updation...");
						while(resultSet.next()){
							System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+
							resultSet.getInt(3)+" "+resultSet.getInt(4));
							}
						
//						System.out.println();
//						System.out.println("Application is in pause state..pls update DB");
//						System.in.read();
						
						
						
						resultSet.beforeFirst();
						
						while(resultSet.next()) {
							int originalPrice=resultSet.getInt(3);
							if(originalPrice<1000) {
								int incPrice=originalPrice+1000;
								resultSet.updateInt(3, incPrice);
								resultSet.updateRow();
								
							}
						}
						System.out.println("After Updation...");
						resultSet.beforeFirst();
						while(resultSet.next()){
//							resultSet.refreshRow();
							System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+
							resultSet.getInt(3)+" "+resultSet.getInt(4));
							}
						
						
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
