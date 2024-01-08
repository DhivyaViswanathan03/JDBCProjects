package com.mysql.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.divs.util.jdbcutil;

public class DateRetrievalApp {

	public static void main(String[] args) throws SQLException {
		Connection connection=null;
		PreparedStatement preStatement=null;
		ResultSet resultSet=null;
		
		try {
			 
	        connection=jdbcutil.getJdbcConnection();
	        String selectQuery="select name,dob,dom from users where name=?";
	        if(connection!=null) {
	        	preStatement=connection.prepareStatement(selectQuery);
	        }
	        
	        if(preStatement!=null) {
	        	
	        	Scanner input=new Scanner(System.in);
	        	System.out.println("Enter the name:");
	        	String name=input.nextLine();
	        	
	        	preStatement.setString(1, name);
	        	ResultSet result=preStatement.executeQuery();
	        	if(result.next()) {
	        		String sname=result.getString(1);
	        		java.sql.Date dob=result.getDate(2);
	        		java.sql.Date dom=result.getDate(3);
	        		System.out.println(sname+"\t"+dob+"\t"+dom);
	        		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyy");
	        		String fdob=dateFormat.format(dob);
	        		String fdom=dateFormat.format(dom);
	        		System.out.println(sname+"\t"+fdob+"\t"+fdom);
	        		
	        	}
	        	
	        }
	            

		} 

		catch(SQLException sql) {
			sql.printStackTrace();
		}catch(Exception e1) {
			e1.printStackTrace();
		}finally {
			jdbcutil.CleanUp(connection, preStatement, resultSet);
			
			System.out.println("connection is closed....");
		}
		
}

}
