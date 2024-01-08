package com.divs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileOperationChallenges5 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new FileReader("input.txt"));
		
		
	PrintWriter pw=new PrintWriter("output.txt");
	
	String target=br.readLine();
	
	while(target !=null) {
		boolean isAvailable=false;
		BufferedReader br1=new BufferedReader(new FileReader("delete.txt"));
		String line=br1.readLine();
		while(line !=null) {
		if(line.equals(target)) {
			isAvailable=true;
			break;
		}
		
			line=br1.readLine();
		
	}
		
		if(isAvailable==false) {
			pw.println(target);
			pw.flush();
		}
		target=br.readLine();
	}
	

				 
				 pw.flush();
				 pw.close();
				 
				 br.close();
				 
				 
				
		
		

	}

}
