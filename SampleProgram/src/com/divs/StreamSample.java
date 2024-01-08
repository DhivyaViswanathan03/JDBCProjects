package com.divs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSample {

	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(5);
		a1.add(10);
		a1.add(15);
		a1.add(20);
		a1.add(0);
		
		List<Integer> ll=a1.stream().filter(i->i%2==0).collect(Collectors.toList());
		
		System.out.println(ll);
		
		ll.forEach(System.out::println);
		
		ArrayList<String> a2=new ArrayList<String>();
		a2.add("hello");
		a2.add("demo");
		a2.add("java");
		a2.add("program");
		a2.add("test");
		
		System.out.println(a2.stream().map(obj->obj.toUpperCase()).collect(Collectors.toList()));
		
		
		System.out.println("After sorting:"+a1.stream().sorted().collect(Collectors.toList()));
		
		
		System.out.println("After customized"+a1.stream().sorted((a11,a21)->a11.compareTo(a21))
				.collect(Collectors.toList()));

	}

}
