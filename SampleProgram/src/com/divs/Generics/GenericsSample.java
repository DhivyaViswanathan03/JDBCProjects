package com.divs.Generics;

interface sample{
	
}

class Integer implements sample{
	int i;
	Integer(int i){
		this.i=101;
	}
	
	
}

class Demo<T extends Integer & sample>{
	
	String name;
	int i;
	sample d;

	public Demo(Integer d,String name) {
		this.name=name;
	}
	
	public Demo(sample d) {
		this.d=d;
	}
	
	public Demo(int i) {
		this.i=i;
	}

	public void show() {
		System.out.println(i);
		
	}
	
}

public class GenericsSample implements sample {

	public static void main(String[] args) {
		//Demo<String> d=new Demo<String>("Hello");
		//sample d = new GenericsSample();
		Demo<Integer> d1=new Demo<Integer>(100);
		d1.show();

	}

}
