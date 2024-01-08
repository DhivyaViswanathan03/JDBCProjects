package com.divs;

import java.io.File;
import java.io.IOException;

public class FileOperations {

	public static void main(String[] args) throws IOException {
		String fileName="abc.txt";
		
		File f=new File(fileName);
		
		System.out.println(f.exists());
		
		f.createNewFile();
		System.out.println(f.exists());
		
		String dirName="abcdir";
		File f2=new File(dirName);
		
		f2.mkdir();
		
		System.out.println(f2.exists());
		
		String dir="abcdir";
		
		File f3=new File(dir);
		
		System.out.println(f3.isDirectory());
		
		File f4=new File(f3,"demo.txt");
		
		f4.createNewFile();
		System.out.println(f4.isFile());
		
		
		String location="c:\\diviya";
		File f5=new File(location);
		f5.mkdir();
		
		File f6=new File(f5,"abc.txt");
		f6.createNewFile();
		
		File f9=new File(f5,"demo.txt");
		f9.createNewFile();
		
		System.out.println(f6.exists());
		
		
		String location1="c:\\job gaurantee batch";
		
		File f7=new File(location);
		
		
//		File f8 =new File("demo.txt");
//		f8.createNewFile();
		
		String [] names=f7.list();
		int count=0;
		for(String name:names) {
			count++;
			System.out.println(name);
		}
		
		System.out.println("count is:"+count);
		System.out.println();
		
		
		
		
		
		

	}

}
