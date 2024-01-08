package com.mysql.main;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.sample.jdbc.util.jdbcutil;

public class ClobInsertOperation {

	public static void main(String[] args) throws SQLException {
		Connection connection=null;
		PreparedStatement preStatement=null;
		ResultSet resultSet=null;
		Scanner input=null;
		String imageLoc=null;
		
		try {
			 input=new Scanner(System.in);
		       System.out.println("enter name");
		       String name=input.nextLine();
		       System.out.println("enterimage location");
		       imageLoc=input.nextLine();
		       
	        connection=jdbcutil.getJdbcConnection();
	        String insertQuery="insert into persons(`name`,`images`) values(?,?)";
	        if(connection!=null) {
	        	preStatement=connection.prepareStatement(insertQuery);
	        }
	        
	        if(preStatement!=null) {
	        	
	        	
	        	
	        	preStatement.setString(1,name);
	        	preStatement.setBinaryStream(2, new FileInputStream(new File(imageLoc)));
	        	
	        			
	        	 int rowCount=preStatement.executeUpdate();
	        	 System.out.println("No of rows affected is:"+rowCount);
	        }
	            

		} 

		catch(SQLException sql) {
			sql.printStackTrace();
		}catch(Exception e1) {
			e1.printStackTrace();
		}finally {
			jdbcutil.CleanUp(connection, preStatement, resultSet);
			input.close();
			System.out.println("connection is closed....");
		}
		
}

}
