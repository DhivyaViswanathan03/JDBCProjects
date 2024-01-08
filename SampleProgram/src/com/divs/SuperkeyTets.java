package com.divs;

class Test{
	String s;
	Test(String s){
		this.s=s;
	}
}

public class SuperkeyTets extends Test{
	String s;

	SuperkeyTets(String s){
		System.out.println(s);
	}

	public SuperkeyTets(String s2, String string) {
		super(s2);
	}
	public static void main(String[] args) {
		
		SuperkeyTets s=new SuperkeyTets("Hello");
	}

}
