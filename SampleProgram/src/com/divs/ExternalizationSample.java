package com.divs;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class External implements Externalizable{
//	 String userName="dhivya";
//	 String password="Sumathi3@";
//	 int pin=123;
	
	transient String userName;
	 String password;
	 int pin;

	 public External(){
		 System.out.println("Zero arg constructor is getting called..");
	 }
	 
	public External(String userName, String password, int pin) {
		this.userName=userName;
		this.password=password;
		this.pin=pin;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		System.out.println("writeExternal is called..");
		out.writeObject(userName);
		out.writeObject(password);	
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		System.out.println("readExternal is called..");
		userName=(String)in.readObject();
		password=(String)in.readObject();
	}
}

public class ExternalizationSample {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		System.out.println("Serialization is started...");
		FileOutputStream fos=new FileOutputStream("yyz.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		//External d1=new External();
		External d1=new External("dhivya","demo",100);
		oos.writeObject(d1);
		System.out.println("Serialization is ended...");
	
		System.out.println("De-Serialization is started...");
		FileInputStream fis=new FileInputStream("yyz.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		External d2=(External)ois.readObject();
		System.out.println(d2.userName);
		System.out.println(d2.password);
		System.out.println(d2.pin);
		System.out.println("De-Serialization is ended...");
		

		

	}

}
