package com.divs;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class LaunchCollection {

	public static void main(String[] args) {
		CopyOnWriteArrayList a1=new CopyOnWriteArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		System.out.println(a1);
		
		Iterator itr=a1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			a1.add(80);
		}
		System.out.println(a1);
		
		ArrayList a2=new ArrayList();
		a2.add(2);
		a2.add(3);
		a2.add(4);
		a2.add(5);
		a2.add(6);
		
		ListIterator itr1=a2.listIterator(a2.size());
		
		
		while(itr1.hasPrevious()) {
			System.out.println(itr1.previous());
			
		}
		itr1.set(8);
		System.out.println("********");
		
ListIterator itr2=a2.listIterator(a2.size());
		
		
		while(itr2.hasPrevious()) {
			System.out.println(itr2.previous());
			
		}

	}

}
