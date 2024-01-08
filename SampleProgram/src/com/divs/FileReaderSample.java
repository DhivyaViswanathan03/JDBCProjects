package com.divs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderSample {

	public static void main(String[] args) throws IOException {
		File f=new File("aaa.txt");
		FileReader fr=new FileReader(f);
		char[] a=new char[(int) f.length()];
		fr.read(a);

         for(char c:a) {
        	 System.out.print(c);
         }
         
         fr.close();
		
		

	}

}
