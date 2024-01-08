package com.sample.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcutil {
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	public static Connection getJdbcConnection() throws SQLException {
		String url="jdbc:mysql://localhost:3306/divs";
		String username="root";
		String password="Welcome@123";
		Connection connection=DriverManager.getConnection(url,username,password);
		return connection;
		
	}
	
	public static void CleanUp(Connection con,Statement stmt,ResultSet rs) throws SQLException {
		if(con !=null) {
			con.close();
		}
		if(stmt!=null) {
			stmt.close();
		}
		if(rs!=null) {
			rs.close();
		}
	}
}


