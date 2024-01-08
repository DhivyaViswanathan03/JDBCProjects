package com.divs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderSample {

	public static void main(String[] args) throws IOException {
	FileReader fr=new FileReader("demo.txt");
	BufferedReader br=new BufferedReader(fr);
	String line=br.readLine();
	while(line!=null) {
		System.out.print(line);
		//line=br.readLine();
	}
	
//	br.close();
//	fr.close();

	}

}
