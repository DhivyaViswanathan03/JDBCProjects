package com.divs;

public class ExceptionDemo {
	
public static int display() {
			
		
		try{
			System.out.println("Start");
			return 10;
			
		}
		finally {
			System.out.println("Program Terminated");
		}
		}

	public static void main(String[] args) {
		
		int result=ExceptionDemo.display();
		System.out.println("result is:"+result);

	}

}
