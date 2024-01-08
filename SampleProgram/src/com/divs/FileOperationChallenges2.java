package com.divs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileOperationChallenges2 {

	public static void main(String[] args) throws IOException {
		//1.Copy file1.txt and file2.txt content to file3.txt
		
		File f1=new File("file1.txt");
		
		FileReader fr1=new FileReader(f1);
	
		BufferedReader br=new BufferedReader(fr1);
		
		
		
		PrintWriter pw=new PrintWriter("file3.txt");
		 String line= br.readLine();
		 
		 while(line !=null) {
			 pw.println(line);
			 line=br.readLine();
		 }
		br=new BufferedReader(new FileReader("file2.txt"));
				line= br.readLine();
				 
				 while(line !=null) {
					 pw.println(line);
					 line=br.readLine();
				 }
				 
				 pw.flush();
				 pw.close();
				 
				
		
		

	}

}
