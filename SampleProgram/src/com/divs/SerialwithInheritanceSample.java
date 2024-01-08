package com.divs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Animal {
	
//	Animal(){
//		System.out.println("Animal constructor is called");
//	}
	int i=10;
}

class Cat extends Animal implements Serializable{
	

//	Cat(){
//		System.out.println("og constructor is called");
//	}
	int j=20;
}

public class SerialwithInheritanceSample {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos=new FileOutputStream("xy.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		Cat d1=new Cat();
		d1.i=888;
		d1.j=999;
		oos.writeObject(d1);
		
		FileInputStream fis=new FileInputStream("xy.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Cat d=(Cat)ois.readObject();
		System.out.println(d.i);
		System.out.println(d.j);
		
		oos.close();
		ois.close();
		

	}

}
