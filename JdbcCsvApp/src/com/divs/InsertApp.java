package com.divs;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertApp {
	
	private static String CSV_FILE="insert into data.csv values(?,?,?)";
	
	

	public static void main(String[] args) {
		
		String url="jdbc:Text:///C:\\\\Users\\\\Navis\\\\Documents\\\\images";
		try (Connection con=DriverManager.getConnection(url)){
			try(PreparedStatement stmt=con.prepareStatement(CSV_FILE);) {
				stmt.setInt(1, 11);
				stmt.setString(2, "reka");
				stmt.setInt(3,28);
				int count=stmt.executeUpdate();
				if(count>0)
					System.out.println("inserted successfully");
				else
					System.out.println("failed");
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
