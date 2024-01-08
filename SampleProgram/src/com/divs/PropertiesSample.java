package com.divs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Properties;

public class PropertiesSample {

	public static void main(String[] args) throws Exception {
//		Hashtable p=new Hashtable();
//		p.put(new Test1(3), "divi");
//		p.put(new Test1(5), "priya");
//		p.put(new Test1(11), "reka");
//		p.put(new Test1(13), "sumathi");
//		p.put(new Test1(23), "viswa");
//		
//		System.out.println(p);

		
		Properties p=new Properties();
		
		FileInputStream fi=new FileInputStream(new File("db.properties").getAbsolutePath());
		p.load(fi);
		
		System.out.println(p);
		System.out.println(p.getProperty("password"));
		
		FileOutputStream fo=new FileOutputStream(new File("db.properties").getAbsolutePath());
		p.store(new FileWriter("db.properties"),
                "GeeksforGeeks Properties Example");
		
	}

}

class Test1{
	int i;

	public Test1(int i) {
		this.i=i;
	}
	
	public int hashCode() {
		return i;
		
	}
	public String toString() {
		return i+"";
		
	}
	
}
