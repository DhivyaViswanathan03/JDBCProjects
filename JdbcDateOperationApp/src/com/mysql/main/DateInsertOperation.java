package com.mysql.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.divs.util.jdbcutil;

public class DateInsertOperation {

	public static void main(String[] args) throws SQLException {
		Connection connection=null;
		PreparedStatement preStatement=null;
		ResultSet resultSet=null;
		Scanner input=null;
		String dob=null;
		String dom=null;
		try {
			 input=new Scanner(System.in);
		       System.out.println("enter name");
		       String name=input.nextLine();
		       System.out.println("enter dob dd-MM-yyyy");
		       dob=input.nextLine();
		       System.out.println("enter dom yyyy-MM-dd");
		       dom=input.nextLine();
	        connection=jdbcutil.getJdbcConnection();
	        String insertQuery="insert into users(`name`,`dob`,`dom`) values(?,?,?)";
	        if(connection!=null) {
	        	preStatement=connection.prepareStatement(insertQuery);
	        }
	        
	        if(preStatement!=null) {
	        	java.sql.Date sDob=null;
	        	java.sql.Date sDom=null;
	        	if(dob!=null) {
	        		SimpleDateFormat d=new SimpleDateFormat("dd-MM-yyyy");
	        		Date utilDate=d.parse(dob);
	        		long dValue=utilDate.getTime();
	        		sDob=new java.sql.Date(dValue);
	        		
	        	}
	        	if(dom!=null) {
	        		sDom=java.sql.Date.valueOf(dom);
	        	}
	        	
	        	preStatement.setString(1,name);
	        	preStatement.setDate(2,sDob);
	        	preStatement.setDate(3, sDom);
	        			
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
