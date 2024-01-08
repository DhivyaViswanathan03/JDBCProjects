package com.divs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account implements Serializable{
	transient String userName="dhivya";
	transient String password="Sumathi3@";
	transient int pin=4444;
	
	private void writeObject(ObjectOutputStream oos) throws IOException {
		oos.defaultWriteObject();
		String encryptUser="123"+userName;
		String encrypt="123"+password;
		int encryptPin=1111+pin;
		oos.writeObject(encryptUser);
		oos.writeObject(encrypt);
		oos.writeInt(encryptPin);
	}
	
	private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
		ois.defaultReadObject();
		String name=(String)ois.readObject();
		String pass=(String)ois.readObject();
		password=pass.substring(3);
		userName=name.substring(3);
		
		int pinNo=(int)ois.readInt();
		pin=pinNo-1111;
		
	}
}

public class SerialDeserialSample {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		System.out.println("Serialization is started...");
		FileOutputStream fos=new FileOutputStream("xyz.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		Account d1=new Account();
		oos.writeObject(d1);
		System.out.println("Serialization is ended...");
	
		System.out.println("De-Serialization is started...");
		FileInputStream fis=new FileInputStream("xyz.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Object o1=ois.readObject();
		Account d2=(Account)o1;
		System.out.println(d2.userName);
		System.out.println(d2.password);
		System.out.println(d2.pin);
		System.out.println("De-Serialization is ended...");
		

		

	}

}
