package com.divs;

import java.util.function.Predicate;

public class LamdaExpSample {

	public static void main(String[] args) {
		
		int x[]= {0,5,10,15,20,25,30};
		Predicate<Integer> p1=i->i>10;
		Predicate<Integer> p2=i->i%2==0;
		
	m1(p1,x);
	System.out.println();
	m1(p2,x);
	
	System.out.println();
	m1(p1.and(p2),x);
	System.out.println();
	m1(p1.or(p2),x);
	
	System.out.println();
    m1(p2.negate(),x);
	}

	private static void m1(Predicate<Integer> p, int[] x) {
		for(int ele:x) 
			if(p.test(ele))
				System.out.println(ele);
		
		
	}

	

}
