package com.divs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileOperationChallenges {

	public static void main(String[] args) throws IOException {
		//1.Copy file1.txt and file2.txt content to file3.txt
		
		File f1=new File("file1.txt");
		
		FileReader fr1=new FileReader(f1);
	
		BufferedReader br1=new BufferedReader(fr1);
		BufferedReader br2=new BufferedReader(new FileReader("file2.txt"));
		
		
		PrintWriter pw=new PrintWriter("file3.txt");
		 String line1= br1.readLine();
		 String line2= br2.readLine();
		 
		 while(line1 !=null || line2 !=null) {
			 if(line1!=null) {
				 pw.println(line1);
			 }
			 line1=br1.readLine();
			 if(line2!=null) {
				 pw.println(line2);
			 }
			 line2=br2.readLine();
		 }
		
				
				 pw.flush();
				 pw.close();
				 
				
		
		

	}

}
