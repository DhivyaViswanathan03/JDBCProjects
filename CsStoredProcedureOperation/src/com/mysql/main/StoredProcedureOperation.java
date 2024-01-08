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

public class StoredProcedureOperation {

	public static void main(String[] args) throws SQLException {
		Connection connection=null;
		CallableStatement callStatement=null;
		ResultSet resultSet=null;
		
		try {
			 
	        connection=jdbcutil.getJdbcConnection();
	        String storedProcedureQuery="{call GET_PRODUCTS_DETAILS_BY_ID(?,?,?,?)}";
	        if(connection!=null) {
	        	callStatement=connection.prepareCall(storedProcedureQuery);
	        }
	        
	        if(callStatement!=null) {
	        	
	        	Scanner input=new Scanner(System.in);
	        	System.out.println("Enter the id:");
	        	int idInput=input.nextInt();
	        	
	        	callStatement.setInt(1, idInput);
	        	
	        	//registering the out variables
	        	callStatement.registerOutParameter(2, Types.VARCHAR);
	        	callStatement.registerOutParameter(3, Types.INTEGER);
	        	callStatement.registerOutParameter(4, Types.INTEGER);
	        	callStatement.execute();
	        	
	        	System.out.println(callStatement.getResultSet());
	        	
	        	
	        	System.out.println(callStatement.getString(2)+":"+callStatement.getInt(3)+":"
	        			+callStatement.getInt(4));
	        		
	        		
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
