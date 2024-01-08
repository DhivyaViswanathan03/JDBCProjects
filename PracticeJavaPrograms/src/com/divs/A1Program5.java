package com.divs;

import java.util.Scanner;

public class A1Program5 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		//int n=input.nextInt();
		int n=16;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((i==0) || (j==0) || (i+j<=(n-1)/2) || (i-j>=(n-1)/2) ||i==(n-1)
						) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		}
}
