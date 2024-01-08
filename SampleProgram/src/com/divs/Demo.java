package com.divs;

public class Demo {
	
	String Demo;
	static {
		System.out.println("static block is called");
	}
	{
		System.out.println(" block is called");
	}
	
	 void demo() {
		System.out.println("method is called");
	}
	
	public static void main(String args[]) {
		//Demo d=new Demo();
		//d.demo();
	}
}
