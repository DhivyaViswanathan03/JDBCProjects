package com.divs;

import java.util.Scanner;

public class PatternProgram4 {
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int n=input.nextInt();
	
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			//Diamond
//			if((i+j>=(n-1)/2  && j<=(n-1)/2 && i<=(n-1)/2)|| i-j<=(n-1)/2 && j<=(n-1)/2 && i>=(n-1)/2
//					|| j-i<=(n-1)/2 && j>=(n-1)/2 && i<=(n-1)/2 || i+j<=(n-1)+(n-1)/2  && j>(n-1)/2 && i>(n-1)/2) {
				if(i+j>=(n-1)/2 && j<=(n-1)/2 && i<=(n-1)/2|| i-j<=(n-1)/2 && j<=(n-1)/2 && i>=(n-1)/2
						|| j-i<=(n-1)/2 && j>=(n-1)/2 && i<=(n-1)/2|| i+j<=(n-1)+(n-1)/2 && i>(n-1)/2 && j>(n-1)/2 ) {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	}
}
