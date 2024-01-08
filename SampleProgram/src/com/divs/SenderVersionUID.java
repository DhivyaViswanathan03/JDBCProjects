package com.divs;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class SenderVersionUID {

	public static void main(String[] args) throws IOException {
		System.out.println("Serialization is started..");
		Dem d1=new Dem();
		FileOutputStream fos=new FileOutputStream("a.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d1);
		System.out.println("Serialization is ended..");

	}

}
