package com.sample.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
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
				
				System.out.println("transaction started...");
				connection.setAutoCommit(false);
				if(statement!=null) {
				statement.executeUpdate
							("insert into politicians(`name`,`party`)values('BJP','modi')");
				statement.executeUpdate
				("insert into politicians(`name`,`party`) values('DMK','stalin')");
				
				Savepoint sp=connection.setSavepoint();
				statement.executeUpdate
				("insert into politicians(`name`,`party`) values('BJP','siddhu')");
				System.out.println("oops something went wrong in insertion");
				connection.rollback(sp);
				System.out.println("operation is rollback");
				
				connection.commit();
				System.out.println("transaction done..");
				
				connection.releaseSavepoint(sp);
				
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
