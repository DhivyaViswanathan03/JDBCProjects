package com.divs;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
//		if(i1<i2)
//			return -1;
//		else if(i1>i2)
//			return +1;
//		else
//			return 0;
		return i1.compareTo(i2);
	}
}


public class ComparatorSample {

	public static void main(String[] args) {
		TreeSet s=new TreeSet();
		s.add(new StringBuffer("hello"));
		s.add(new StringBuffer("demo"));
		s.add(new StringBuffer("sara"));
		s.add(new StringBuffer("priya"));
		s.add(new StringBuffer("Apple"));
		System.out.println(s);
		

	}

}


