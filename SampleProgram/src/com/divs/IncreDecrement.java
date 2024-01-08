package com.divs;

public class IncreDecrement {

	public static void main(String[] args) {
		int x=5;
		IncreDecrement d=new IncreDecrement();
		d.Display(x);
		
		System.out.println(x);
		
//		for(int j=1;j<5;j++) {
//			System.out.println(j);
//		}

	}
	
	void Display(int x) {
		System.out.println(x++);
		System.out.println(x);
	}

}
