package com.divs;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectApp {
	
	private static String EXCEL_FILE="select * from data.student";
	
	

	public static void main(String[] args) {
		
		String url="jdbc:Excel:///C:\\images";
		try (Connection con=DriverManager.getConnection(url)){
			try(Statement stmt=con.createStatement();) {
				try(ResultSet rs=stmt.executeQuery(EXCEL_FILE)) {
					while(rs.next()) {
						System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
					}
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
