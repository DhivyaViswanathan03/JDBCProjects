package com.divs;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterSample {

	public static void main(String[] args) throws IOException {
		FileWriter fr=new FileWriter("demo.txt");
		PrintWriter pw=new PrintWriter(fr);
		pw.println(true);
		pw.println(10);
		pw.flush();
		pw.close();

	}

}
