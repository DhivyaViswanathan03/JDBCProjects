package com.divs.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateFormatDbSpecific {

	public static void main(String[] args) throws ParseException {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter date value dd-MM-yyyy :");
		String date=input.next();
		
		System.out.println("String date is:"+date);
		
		SimpleDateFormat d=new SimpleDateFormat("dd-MM-yyyy");
		Date utilDate=d.parse(date);
		
		System.out.println("Util Date is:"+utilDate);
		
		long dValue=utilDate.getTime();
		
		Date sDate=new java.sql.Date(dValue);
		System.out.println("Sql date is:"+sDate);
		
		System.out.print("Enter the DOM date yyyy-MM-dd:");
		String dom=input.next();
		
		System.out.println("String format is:"+dom);
		
		Date sqlDateValue=java.sql.Date.valueOf(dom);
		System.out.println("SQL format date is:"+sqlDateValue);

	}

}
