package com.divs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileOperationChallenges3 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new FileReader("input.txt"));
		
		PrintWriter pw=new PrintWriter("output.txt");
		
		String line1=br.readLine();
		while(line1!=null) {
			boolean isAvailable=false;
			BufferedReader br1=new BufferedReader(new FileReader("delete.txt"));
			String line2=br1.readLine();
			while(line2!=null) {
				if(line1.equals(line2)) {
				isAvailable=true;
				break;
				}
				line2=br1.readLine();
			}
			
			if(isAvailable==false) {
				pw.println(line1);
				pw.flush();
			}
			
			line1=br.readLine();
		}
		
		pw.close();
		br.close();
		
	
	}

}
