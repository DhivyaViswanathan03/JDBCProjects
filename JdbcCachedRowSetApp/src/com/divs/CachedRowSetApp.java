package com.divs;

import java.sql.Connection;
import java.sql.DriverManager;
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

public class CachedRowSetApp {
	
	public static void main(String[] args) throws Exception {
		Connection con=DriverManager.getConnection("jdbc:mysql:///divs","root","Welcome@123");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select id,pname,price,qty from products");
		RowSetFactory factory = RowSetProvider.newFactory();
		CachedRowSet cRowSet = factory.createCachedRowSet();
		cRowSet.populate(rs);
		con.close();
		
		System.out.println("id\tpname\tprice\tqty");
		while(cRowSet.next()) {
			System.out.println(cRowSet.getInt(1)+"\t"+cRowSet.getString(2)+"\t"
					+cRowSet.getInt(3)+"\t"+cRowSet.getInt(4));
		}
		
		
			
		
		
	
		

}
}
