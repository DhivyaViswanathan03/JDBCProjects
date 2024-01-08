package com.divs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable{
	static transient int i=10;
	final transient int j=20;
	static{
		System.out.println("static block is getting executed");
	}
	Dog(){
		System.out.println("constructor is called");
	}
}

public class CustomSerialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		System.out.println("Serialization is started...");
		FileOutputStream fos=new FileOutputStream("xyz.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		Dog d1=new Dog();
		oos.writeObject(d1);
		System.out.println("Serialization is ended...");
	
		System.out.println("De-Serialization is started...");
		FileInputStream fis=new FileInputStream("xyz.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Object o1=ois.readObject();
		Dog d2=(Dog)o1;
		System.out.println(d2.i);
		System.out.println(d2.j);
		System.out.println("De-Serialization is ended...");
		

		

	}

}
