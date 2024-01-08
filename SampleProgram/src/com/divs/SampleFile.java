package com.divs;

import java.io.File;
import java.io.IOException;

public class SampleFile {

	public static void main(String[] args) throws IOException {
		String s="hello";
		int directory=0;
		int file=0;
		File f=new File(s);
		f.mkdir();
		File f2=new File("hello1.txt");
		f2.createNewFile();
		
		File f3=new File(f2,"hello1.txt");
		
		String location="C:\\Users\\Navis\\JavaPrograms\\SampleProgram";
		
		File f4=new File(location);
		
		String[] names=f4.list();
		for(String name:names) {
			File f5=new File(location,name);
			System.out.println(f5.length());
			if(f5.isDirectory())
				directory++;
			
			if(f5.isFile())
				file++;
		}
		
		System.out.println("count of dir:"+directory);
		System.out.println("count of file:"+file);

	}

}
