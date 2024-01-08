package com.sample.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteApp {

	

		public static void main(String[] args) throws SQLException {
			Connection connection=null;
			Statement statement=null;
			ResultSet resultSet=null;
			try {
				
				//from JDBC 4.x autoloading the driver 
//				Class.forName("com.mysql.cj.jdbc.Driver");
//				System.out.println("driver loaded successfully....");
				String url="jdbc:mysql://localhost:3306/divs";
				String username="root";
				String password="Welcome@123";
				
		        connection=DriverManager.getConnection(url,username,password);
		        System.out.println("contion established...");
		        System.out.println(connection.getClass().getName());
		        statement=connection.createStatement();
		        int rowCount=statement.executeUpdate("delete from song where songid=101");
		        System.out.println("No of rows affected is:"+rowCount);
		        

			} 
//			catch (ClassNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
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
