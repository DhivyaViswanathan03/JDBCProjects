package com.divs;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterSample {

	public static void main(String[] args) throws IOException {
		File f=new File("aaa.txt");
		FileWriter fw=new FileWriter(f,false);
		
		fw.write(1);
		fw.write("\n");
		fw.write("Hello");
		fw.write("\n");
				char c[]= {'q','w'};
		fw.write(c);
		fw.flush();

	}

}
