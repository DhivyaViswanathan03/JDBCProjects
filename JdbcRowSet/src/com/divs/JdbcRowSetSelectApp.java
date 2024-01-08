package com.divs;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.FilteredRowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import javax.sql.rowset.WebRowSet;

import com.mysql.cj.jdbc.MysqlConnectionPoolDataSource;

public class JdbcRowSetSelectApp {
	
	public static void main(String[] args) {
		RowSetFactory factory;
		try {
			factory = RowSetProvider.newFactory();
			JdbcRowSet jdbcRowSet = factory.createJdbcRowSet();
			jdbcRowSet.setUrl("jdbc:mysql:///divs");
			jdbcRowSet.setUsername("root");
			jdbcRowSet.setPassword("Welcome@123");
			jdbcRowSet.setCommand("select id,pname,price,qty from products");
			jdbcRowSet.execute();
			System.out.println("Forward direction..");
			System.out.println("id\tpname\tprice\tqty");
			while(jdbcRowSet.next()) {
				System.out.println(jdbcRowSet.getInt(1)+"\t"+jdbcRowSet.getString(2)
				+"\t"+jdbcRowSet.getInt(3)+"\t"+jdbcRowSet.getInt(4));
			}
			
			System.out.println("backward direction..");
			System.out.println("id\tpname\tprice\tqty");
			while(jdbcRowSet.previous()) {
				System.out.println(jdbcRowSet.getInt(1)+"\t"+jdbcRowSet.getString(2)
				+"\t"+jdbcRowSet.getInt(3)+"\t"+jdbcRowSet.getInt(4));
			}
			
			System.out.println();
			jdbcRowSet.absolute(3);
			System.out.println(jdbcRowSet.getInt(1)+"\t"+jdbcRowSet.getString(2)
			+"\t"+jdbcRowSet.getInt(3)+"\t"+jdbcRowSet.getInt(4));
			
			System.out.println();
			jdbcRowSet.absolute(-2);
			System.out.println(jdbcRowSet.getInt(1)+"\t"+jdbcRowSet.getString(2)
			+"\t"+jdbcRowSet.getInt(3)+"\t"+jdbcRowSet.getInt(4));
			
			System.out.println();
			jdbcRowSet.relative(1);
			System.out.println(jdbcRowSet.getInt(1)+"\t"+jdbcRowSet.getString(2)
			+"\t"+jdbcRowSet.getInt(3)+"\t"+jdbcRowSet.getInt(4));
			System.out.println();
			jdbcRowSet.relative(-3);
			System.out.println(jdbcRowSet.getInt(1)+"\t"+jdbcRowSet.getString(2)
			+"\t"+jdbcRowSet.getInt(3)+"\t"+jdbcRowSet.getInt(4));
			
		} 
		
		
	
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}
}
