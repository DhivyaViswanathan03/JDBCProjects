package com.mysql.main;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.Reader;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.apache.commons.io.IOUtils;

import com.sample.jdbc.util.jdbcutil;

public class StoredProcedureOperation2 {

	public static void main(String[] args) throws SQLException {
		Connection connection=null;
		CallableStatement callStatement=null;
		ResultSet resultSet=null;
		
		String product1=null;
		String product2=null;
		
		try {
			 
	        connection=jdbcutil.getJdbcConnection();
	        String storedProcedureQuery="{call GET_PRODUCT_BY_NAME(?,?)}";
	        if(connection!=null) {
	        	callStatement=connection.prepareCall(storedProcedureQuery);
	        }
	        
	        if(callStatement!=null) {
	        	
	        	Scanner input=new Scanner(System.in);
	        	System.out.println("Enter the name 1:");
	        	product1=input.next();
	        	System.out.println("Enter the name 2:");
	        	product2=input.next();
	        	
	        	callStatement.setString(1, product1);
	        	callStatement.setString(2, product2);
	        	callStatement.execute();
	        	
	        	resultSet=callStatement.getResultSet();
	        	
	        	if(resultSet!=null) {
	        		while(resultSet.next()) {
	        			System.out.println(resultSet.getInt(1)+":"+resultSet.getString(2)+":"+resultSet.getInt(3)+":"
	    	        			+resultSet.getInt(4));
	        		}
	        	}
	        	
	        	
	        	
	        		
	        		
	        	}
	        	
	        
	            

		} 

		catch(SQLException sql) {
			sql.printStackTrace();
		}catch(Exception e1) {
			e1.printStackTrace();
		}finally {
			jdbcutil.CleanUp(connection, callStatement, resultSet);
			
			System.out.println("connection is closed....");
		}
		
}

}
