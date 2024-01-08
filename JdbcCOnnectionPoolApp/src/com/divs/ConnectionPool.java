package com.divs;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.MysqlConnectionPoolDataSource;

public class ConnectionPool {
	
	public static void main(String[] args) {
		MysqlConnectionPoolDataSource datasource=new MysqlConnectionPoolDataSource();
		datasource.setUrl("jdbc:mysql:///divs");
		datasource.setUser("root");
		datasource.setPassword("Welcome@123");
		try {
			Connection con=datasource.getConnection();
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select id,pname,price,qty from products");
			System.out.println("id\tpname\tprice\tqty");
					while(rs.next()) {
						System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)
						+"\t"+rs.getInt(4));
					}
					
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
