package com.sample.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;
import java.util.Scanner;

import com.sample.jdbc.util.jdbcutil;

public class UpdatableResultSetOnUpdation {

	

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
						
						resultSet.moveToInsertRow();
						//resultSet.updateInt(1,10);
						resultSet.updateString(2, "demm");
						resultSet.updateInt(3, 100);
						resultSet.updateInt(4, 2);
						resultSet.insertRow();
						
						resultSet.beforeFirst();
						System.out.println("After Updation...");
						while(resultSet.next()){
							resultSet.refreshRow();
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
