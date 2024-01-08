package com.divs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileOperationChallenges4 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new FileReader("input.txt"));
		
		String data=br.readLine();
		int maxLen=0;
		String result="";
		while(data!=null) {
			int stringLen=data.length();
			if(maxLen <stringLen) {
				maxLen=stringLen;
				result=data;
			}
			data=br.readLine();
		}
		
		System.out.println(result);
		System.out.println(maxLen);
		

		

	}

}
