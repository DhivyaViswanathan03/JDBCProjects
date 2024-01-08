package com.divs;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class selectApp {
	
	private static String CSV_FILE="select * from data.csv";
	
	

	public static void main(String[] args) {
		
		String url="jdbc:Text:///C:\\Users\\Navis\\Documents\\images";
		try (Connection con=DriverManager.getConnection(url)){
			try(Statement stmt=con.createStatement();) {
				try(ResultSet rs=stmt.executeQuery(CSV_FILE)) {
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
