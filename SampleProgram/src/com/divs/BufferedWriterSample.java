package com.divs;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterSample {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("aaa.txt",true);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(105);
		bw.newLine();
		bw.write("divs");
		bw.newLine();
		char a[]= {'a','d','e'};
		bw.write(a);
		bw.close();

	}

}
