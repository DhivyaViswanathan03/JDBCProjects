package com.divs;

class Parent{
	String s;
	static int a=10;
	Parent(String s){
		this.s=s;
	}
	Parent(){
		
	}
}

class Child extends Parent{
	static int a=20;
	String s;
	Child(String s){
		this.s=s;
	}
	
	
	
}

public class Inheritance {

	public static void main(String[] args) {
		Parent c=new Child("Hello");
		System.out.println(c.a);
		
	}

}
