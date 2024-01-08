package com.sample.jdbc;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class updateApp {

	

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
				
				FileInputStream fis=new FileInputStream
						("C:\\Users\\Navis\\JavaPrograms\\JdbcDemoSample\\src\\application.properties");
				Properties pos=new Properties();
				pos.load(fis);
				
		        connection=DriverManager.getConnection(pos.getProperty("url"),
		        		pos.getProperty("username"),pos.getProperty("password"));
		        System.out.println("contion established...");
		        System.out.println(connection.getClass().getName());
		        statement=connection.createStatement();
		        int rowCount=statement.executeUpdate("update song set singer='yuvan' where songid=106");
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
