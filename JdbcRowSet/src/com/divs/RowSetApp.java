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

public class RowSetApp {
	
	public static void main(String[] args) {
		RowSetFactory factory;
		try {
			factory = RowSetProvider.newFactory();
			JdbcRowSet jdbcRowSet = factory.createJdbcRowSet();
			CachedRowSet cRowSet = factory.createCachedRowSet();
			WebRowSet wRowSet = factory.createWebRowSet();
			FilteredRowSet fRowSet = factory.createFilteredRowSet();
			System.out.println(jdbcRowSet.getClass().getName());
			System.out.println(cRowSet.getClass().getName());
			System.out.println(wRowSet.getClass().getName());
			System.out.println(fRowSet.getClass().getName());
		} 
		
	
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}
}
