package com.mysql.main;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.Reader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.apache.commons.io.IOUtils;

import com.sample.jdbc.util.jdbcutil;

public class ClobRetrievalOperation {

	public static void main(String[] args) throws SQLException {
		Connection connection=null;
		PreparedStatement preStatement=null;
		ResultSet resultSet=null;
		
		try {
			 
	        connection=jdbcutil.getJdbcConnection();
	        String selectQuery="select id,name,history from cities where id=?";
	        if(connection!=null) {
	        	preStatement=connection.prepareStatement(selectQuery);
	        }
	        
	        if(preStatement!=null) {
	        	
	        	Scanner input=new Scanner(System.in);
	        	System.out.println("Enter the id:");
	        	int idInput=input.nextInt();
	        	
	        	preStatement.setInt(1, idInput);
	        	ResultSet result=preStatement.executeQuery();
	        	if(result.next()) {
	        		int id=result.getInt(1);
	        		String sname=result.getString(2);
	        		Reader reader=result.getCharacterStream(3);
	        		File f=new File("copiedFile.text");
	        		FileWriter fw=new FileWriter(f);
	        		
	        		//1st approach
//	        		int i=is.read();
//	        		while(i!=-1) {
//	        			fos.write(i);
//	        			i=is.read();
//	        		}
	        		
	        		//2nd approach
//	        		byte[] b=new byte[1024];
//	        		while(is.read(b)>0) {
//	        			fos.write(b);
//	        		}
	        		
	        		//3rd approach--Using JAR API's
	        		
	        		IOUtils.copy(reader, fw);
	        		System.out.println(id+"\t"+sname+"\t"+f.getAbsolutePath());
	        		
	        		
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
