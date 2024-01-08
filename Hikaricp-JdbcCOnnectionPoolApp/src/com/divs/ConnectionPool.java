package com.divs;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.MysqlConnectionPoolDataSource;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class ConnectionPool {
	
	public static void main(String[] args) {
		HikariConfig config=new HikariConfig("C:\\Users\\Navis\\JavaPrograms\\Hikaricp-JdbcCOnnectionPoolApp\\src\\com\\divs\\db.properties");
		try (HikariDataSource dataSource = new HikariDataSource(config)) {
			try {
				Connection con=dataSource.getConnection();
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

}
