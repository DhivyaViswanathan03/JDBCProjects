package com.divs;

import java.util.ArrayList;

public class LamdaSample {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		a.add("navin");
		a.add("rahul");
		
		a.forEach(a1->System.out.println(a1));
		
		System.out.println();
		
		a.forEach(System.out::println);

	}

}
