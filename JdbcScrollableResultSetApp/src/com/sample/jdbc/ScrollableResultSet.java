package com.sample.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;
import java.util.Scanner;

import com.sample.jdbc.util.jdbcutil;

public class ScrollableResultSet {

	

		public static void main(String[] args) throws SQLException {
			Connection connection=null;
			Statement statement=null;
			ResultSet resultSet=null;
			
			try {
				connection=jdbcutil.getJdbcConnection();
				if (connection != null) {
					statement=
							connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
				}
				if(statement!=null) 
					
					resultSet=statement.executeQuery("select * from products");
					
					if(resultSet!=null) {
						
						System.out.println("forward direction");
						while(resultSet.next()){
							System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+
							resultSet.getInt(3)+" "+resultSet.getInt(4));
							}
						
						System.out.println();
						System.out.println("backward direction..");
						while(resultSet.previous()){
							System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+
							resultSet.getInt(3)+" "+resultSet.getInt(4));
							}
						
						System.out.println();
						resultSet.relative(3);
						System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+
								resultSet.getInt(3)+" "+resultSet.getInt(4));
						
						System.out.println();
						
					    resultSet.first();
					
					    System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+
							resultSet.getInt(3)+" "+resultSet.getInt(4));
					
					    System.out.println();
					
					    resultSet.last();
					
					    System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+
							resultSet.getInt(3)+" "+resultSet.getInt(4));
					
					
					System.out.println();
						resultSet.absolute(2);
						
						System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+
								resultSet.getInt(3)+" "+resultSet.getInt(4));
						
						resultSet.relative(-1);
						System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+
								resultSet.getInt(3)+" "+resultSet.getInt(4));
						
						System.out.println();
						resultSet.absolute(-5);
						
						System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+
								resultSet.getInt(3)+" "+resultSet.getInt(4));
						System.out.println();
						
						resultSet.relative(-2);
						
						System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+
								resultSet.getInt(3)+" "+resultSet.getInt(4));
						
						System.out.println();
						resultSet.absolute(-5);
						
						System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+
								resultSet.getInt(3)+" "+resultSet.getInt(4));
						
						System.out.println();
						
						resultSet.absolute(6);
						System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+
								resultSet.getInt(3)+" "+resultSet.getInt(4));
						
                       System.out.println();
						
						resultSet.absolute(2);
						System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+
								resultSet.getInt(3)+" "+resultSet.getInt(4));
						
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
