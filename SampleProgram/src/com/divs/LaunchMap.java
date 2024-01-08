package com.divs;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class LaunchMap {

	public static void main(String[] args) {
		Map p=new HashMap();
		p.put(10, "sachin");
		p.put(20, "dhoni");
		p.put(8, "kohli");
		p.put(17, "dravid");
		p.put(31, "mouli");
		System.out.println(p);
		
		System.out.println();
		Set s=p.keySet();
		System.out.println(s);
		
		System.out.println();
		Collection c=p.values();
		System.out.println(c);
		
		System.out.println();
		Set ss=p.entrySet();
		System.out.println(ss);
		
		System.out.println();
		Iterator itr=ss.iterator();
		while(itr.hasNext()) {
			Map.Entry mapData=(Map.Entry)itr.next();
			System.out.println(mapData.getKey()+" :"+mapData.getValue());
			if(mapData.getKey().equals(10)) {
				mapData.setValue("Dhivya");
			}
		}
		
		System.out.println();
		System.out.println(ss);

	}

}
