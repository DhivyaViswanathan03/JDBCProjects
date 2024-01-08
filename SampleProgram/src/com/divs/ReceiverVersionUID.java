package com.divs;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class ReceiverVersionUID {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		System.out.println("De-Serialization is started..");
		FileInputStream fis=new FileInputStream("a.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dem d=(Dem)ois.readObject();
		System.out.println(d.i+"........>"+d.j);
		System.out.println("De-Serialization is ended..");

	}

}
