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

public class JdbcRowSetInsertApp {
	
	public static void main(String[] args) {
		RowSetFactory factory;
		try {
			factory = RowSetProvider.newFactory();
			CachedRowSet jdbcRowSet = factory.createCachedRowSet();
			jdbcRowSet.setUrl("jdbc:mysql:///divs");
			jdbcRowSet.setUsername("root");
			jdbcRowSet.setPassword("Welcome@123");
			jdbcRowSet.setCommand("select id,pname,price,qty from products");
			jdbcRowSet.execute();
			
			jdbcRowSet.moveToInsertRow();
			
			Scanner input=new Scanner(System.in);
			while(true) {
				System.out.println("Enter pid");
				int id=input.nextInt();
				System.out.println("Enter pname");
				String name=input.next();
				System.out.println("Enter price");
				int price=input.nextInt();
				System.out.println("Enter quantity");
				int qty=input.nextInt();
				jdbcRowSet.updateInt(1, id);
				jdbcRowSet.updateString(2, name);
				jdbcRowSet.updateInt(3, price);
				jdbcRowSet.updateInt(4, qty);
				
				jdbcRowSet.insertRow();
				System.out.println("inserted successfully..");
				
				System.out.println("do u want to continue [YES/NO]:::");
				String option=input.next();
				if(option.equalsIgnoreCase("NO"))
					break;
				jdbcRowSet.moveToCurrentRow();
				jdbcRowSet.acceptChanges();
				
			}
			input.close();
			jdbcRowSet.close();
			
		} 
		
		
	
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}
}
