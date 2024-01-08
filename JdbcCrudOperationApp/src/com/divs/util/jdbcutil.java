package com.divs.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class jdbcutil {
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	public static Connection getJdbcConnection() throws SQLException, IOException {
//		FileInputStream fis=
//				new FileInputStream("C:\\Users\\Navis\\JavaPrograms\\JdbcCrudOperationApp\\src\\com\\divs\\properties\\application.properties");
//		Properties pos=new Properties();
//		pos.load(fis);
//		Connection connection=DriverManager.getConnection(pos.getProperty("url"),
//				pos.getProperty("username"),pos.getProperty("password"));
		HikariConfig hr=new HikariConfig("C:\\Users\\Navis\\JavaPrograms\\JdbcCrudOperationApp\\src\\com\\divs\\properties\\application.properties");
		HikariDataSource dataSource=new HikariDataSource(hr);
		Connection con=dataSource.getConnection();
		return con;
		
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


