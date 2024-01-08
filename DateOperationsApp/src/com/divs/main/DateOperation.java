package com.divs.main;

import java.util.Date;

public class DateOperation {

	public static void main(String[] args) {
		Date d=new Date();
		
		System.out.println(d);
		
		long value=d.getTime();
		
		Date date=new java.sql.Date(value);
		System.out.println(date);
		

	}

}
