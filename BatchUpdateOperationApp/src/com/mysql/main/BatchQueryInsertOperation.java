package com.mysql.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.sample.jdbc.util.jdbcutil;

public class BatchQueryInsertOperation {

	public static void main(String[] args) throws SQLException {
		Connection connection=null;
		PreparedStatement preStatement=null;
		ResultSet resultSet=null;
		Scanner input=null;
		
		try {
			   
	        connection=jdbcutil.getJdbcConnection();
	        String insertQuery="insert into products(`pname`,`price`,`qty`) values(?,?,?)";
	        if(connection!=null) {
	        	preStatement=connection.prepareStatement(insertQuery);
	        }
	        input=new Scanner(System.in);
	        
	        if(preStatement!=null) {
	        	while(true){
	        	   System.out.println("enter name");
			       String name=input.next();
			       System.out.println("enter price");
			       int price=input.nextInt();
			       System.out.println("enter quantity");
			       int qty=input.nextInt();
	        	
	        	
	        	preStatement.setString(1,name);
	        	preStatement.setInt(2,price);
	        	preStatement.setInt(3,qty);
	        	
	        	//add batch
	        	preStatement.addBatch();
	        	
	        	System.out.println("do u want continue YES/NO::");
	        	String option=input.next();
	        	
	        	
	        	if(option.equalsIgnoreCase("NO")) {
	        		break;
	        	}
	        	
	        	}	
	        	
	        	preStatement.executeUpdate();
	        	 
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
