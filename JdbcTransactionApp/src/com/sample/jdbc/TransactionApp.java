package com.sample.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.sample.jdbc.util.jdbcutil;

public class TransactionApp {

	

		public static void main(String[] args) throws SQLException {
			Connection connection=null;
			Statement statement=null;
			ResultSet resultSet=null;
			Scanner scanner=null;
			try {
				connection=jdbcutil.getJdbcConnection();
				if (connection != null) {
					statement=connection.createStatement();
				}
				if(statement!=null) {
					resultSet=statement.executeQuery("select name,balance from accounts");
				}
				
				System.out.println("Before Transaction....");
				if (resultSet != null) {
					while(resultSet.next()) {
						System.out.println(resultSet.getString(1)+" "+resultSet.getInt(2));
					}
				}
				connection.setAutoCommit(false);
				statement.executeUpdate("update accounts set balance=balance-2000 where name='sachin'");
				statement.executeUpdate("update accounts set balance=balance+2000 where name='dhoni'");
				
				
				
				System.out.print("Do u confirm [YES?NO]::");
				scanner=new Scanner(System.in);
				String option=scanner.next();
				if(option.equalsIgnoreCase("YES")) {
					connection.commit();
				}else {
					connection.rollback();
				}
				
				System.out.println("After the transaction...");
				ResultSet rs=statement.executeQuery("select name,balance from accounts");
				if (rs != null) {
					while(rs.next()) {
						System.out.println(rs.getString(1)+" "+rs.getInt(2));
					}
				}
				
				
				

			} 
//			
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
