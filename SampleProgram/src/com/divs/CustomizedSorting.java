package com.divs;

import java.io.IOException;

public class CustomizedSorting {
	
	static void print() throws Throwable {
		throw new IOException();
	}
	public static void main(String[] args) {
		try {
			print();
		}catch(IOException e1) {
			System.out.println(e1);
		}
		catch(Throwable e) {
			System.out.println(e);
		}
		

	}

}
