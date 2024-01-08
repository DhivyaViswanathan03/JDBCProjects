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

public class InsertAppValuesDynamic {

	public static void main(String[] args) throws SQLException {
		Connection connection=null;
		PreparedStatement preStatement=null;
		ResultSet resultSet=null;
		Scanner input=null;
		try {
			String insertQuery="insert into song(`songname`,`singer`,`age`) values(?,?,?)";
			connection=jdbcutil.getJdbcConnection();
			if(connection!=null) {
				preStatement=connection.prepareStatement(insertQuery);
			}
			input=new Scanner(System.in);
			if(preStatement!=null) {
				while(true) {

					System.out.println("enter songname");
					String songName=input.nextLine();
					System.out.println("enter singer");
					String singer=input.nextLine();
					System.out.println("enter age");
					int age=input.nextInt();
					preStatement.setString(1,songName);
					preStatement.setString(2,singer);
					preStatement.setInt(3, age);

					//add batch
                    preStatement.addBatch();
                    
                    System.out.print("do u want to insert more[YES/NO]::");
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
