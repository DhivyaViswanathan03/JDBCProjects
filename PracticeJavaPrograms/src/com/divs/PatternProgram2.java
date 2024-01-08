package com.divs;

import java.util.Scanner;

public class PatternProgram2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				//Z
//				if(i==0 || i==n-1 || i+j==(n-1)) {
				//Q
				if((i==n/4 && j>n/4 && j<(3*n)/4) || (i==(3*n)/4 && j>n/4 && j<(3*n)/4) || 	(j==n/4 && i>n/4 && i<(3*n)/4)
						|| (j==(3*n)/4 && i>n/4 && i<(3*n)/4) || (i==j && i>=n/2 && j>=n/2)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
