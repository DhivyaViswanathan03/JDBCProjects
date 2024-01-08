package com.mysql.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.sample.jdbc.util.jdbcutil;

public class BlobInsertOperation {

	public static void main(String[] args) throws SQLException {
		Connection connection=null;
		PreparedStatement preStatement=null;
		ResultSet resultSet=null;
		Scanner input=null;
		String pdfLoc=null;
		
		try {
			 input=new Scanner(System.in);
		       System.out.println("enter name");
		       String name=input.nextLine();
		       System.out.println("enter pdf location");
		       pdfLoc=input.nextLine();
		       
	        connection=jdbcutil.getJdbcConnection();
	        String insertQuery="insert into cities(`name`,`history`) values(?,?)";
	        if(connection!=null) {
	        	preStatement=connection.prepareStatement(insertQuery);
	        }
	        
	        if(preStatement!=null) {
	        	
	        	
	        	
	        	preStatement.setString(1,name);
	        	preStatement.setCharacterStream(2, new FileReader(new File(pdfLoc)));
	        	
	        			
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
