package com.divs;

import java.util.HashMap;

public class MapSample {

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		Temp t=new Temp();
		hm.put(t,"demo");
		System.out.println(hm);

	}

}

class Temp{
	
	@Override
	public String toString() {
		return "Temp";
		
	}
	
}