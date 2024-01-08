package com.divs;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.FilteredRowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import javax.sql.rowset.WebRowSet;

import com.mysql.cj.jdbc.MysqlConnectionPoolDataSource;

public class JdbcRowSetUpdateApp {
	
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
			

			while(jdbcRowSet.next()) {
				int oldQty=jdbcRowSet.getInt(4);
				if(oldQty<12) {
					
					
					jdbcRowSet.deleteRow();
					}
				
				}
			
			System.out.println("deleted successfully..");
			

			
			jdbcRowSet.close();
			
		} 
		
		
	
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}
}
