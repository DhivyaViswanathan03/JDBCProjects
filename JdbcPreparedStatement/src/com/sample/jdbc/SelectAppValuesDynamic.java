package com.sample.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.xdevapi.PreparableStatement;
import com.sample.jdbc.util.jdbcutil;

public class SelectAppValuesDynamic {

	

		public static void main(String[] args) throws SQLException {
			Connection connection=null;
			PreparedStatement preStatement=null;
			ResultSet resultSet=null;
			Scanner input=null;
			try {
				 input=new Scanner(System.in);

			       System.out.println("enter sid");
			       int sid=input.nextInt();
		        connection=jdbcutil.getJdbcConnection();
		        String selectQuery="select * from song where songid=?";
		        if(connection!=null) {
		        	preStatement=connection.prepareStatement(selectQuery);
		        }
		        
		        if(preStatement!=null) {
		        	preStatement.setInt(1,sid);
		        	
		        	 resultSet=preStatement.executeQuery();
		        	 
		        }
		        System.out.println("songid\tsongname\tsinger\tage");
		        
		        if(resultSet !=null) {
		         if(resultSet.next()) {
		        	 System.out.println(resultSet.getInt(1)+"\t"+resultSet.getString(2)+"\t"
		        			 +resultSet.getString(3)+"\t"+resultSet.getString(4));
		         }else {
		        	 System.out.println("no record found for is::"+sid);
		         }
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
