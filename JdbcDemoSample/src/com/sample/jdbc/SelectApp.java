package com.sample.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectApp {

	

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
		        resultSet=statement.executeQuery("select songid,songname,singer from song");
		        System.out.println("songid\tsongname\tsinger");
		        while(resultSet.next()) {
		        	int songId=resultSet.getInt(1);
		        	String songName=resultSet.getString(2);
		        	String singer=resultSet.getString(3);
		        	System.out.println(songId+"\t"+songName+"\t"+singer);
		        }

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
