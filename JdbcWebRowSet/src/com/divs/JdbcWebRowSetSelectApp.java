package com.divs;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import javax.sql.rowset.WebRowSet;

public class JdbcWebRowSetSelectApp {
	
	public static void main(String[] args) throws IOException {
		RowSetFactory factory;
		try {
			factory = RowSetProvider.newFactory();
			WebRowSet jdbcRowSet = factory.createWebRowSet();
			jdbcRowSet.setUrl("jdbc:mysql:///divs");
			jdbcRowSet.setUsername("root");
			jdbcRowSet.setPassword("Welcome@123");
			jdbcRowSet.setCommand("select id,pname,price,qty from products");
			jdbcRowSet.execute();

FileWriter fw=new FileWriter("std.xml");
jdbcRowSet.writeXml(fw);
			
			
		} 
		
		
	
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}
}
