package com.divs;

import java.util.Scanner;

public class PatternPrograms {
	
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//			    if(i==0 || i==n-1 || j==0 || j==n-1 || i==(n-1)/2) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//				
//			}
//			System.out.println();
//		}
		
		
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
				// H
//				if(j==0 || j==n-1 || i==(n-1)/2) {
				
				// E
//			if(i==0 || i==(n-1)/2 || i==n-1 || j==0) {
				// A
//				if((j==0 && i>0) || (i==0 && j>0 && j<(n-1)/2) || (i==(n-1)/2 && j<=(n-1)/2 ) ||
//						(j==(n-1)/2 && i>0)) {
				
				//D
//				if((i==0 && j<n-1) || j==0 || (i==n-1 && j<n-1) || (j==n-1 && i>0 && i<n-1)) {
//					System.out.print("*");
//					}else {
//						System.out.print(" ");
//					}
				
				//B
//				if((i==0 && j<(n-1)/2) ||  (j==0) || (i==(n-1)/2 && j< (n-1)/2) && (i==n-1 && j<(n-1)/2) ||
//						(j==(n-1)/2 && i>0 && i!=(n-1)/2 && i<n-1)) {
//				if((i==0 && j<(n-1)/2) ||(i==n-1 && j<(n-1)/2) ||  (j==0) || (i==(n-1)/2 && j< (n-1)/2) ||
//						(j==(n-1)/2 && i>0 && i!=(n-1)/2 && i<n-1)) {
				
//				if((i==0 && j<(n-1)/2) ||  (j==0) || (i==(n-1)/2 && j< (n-1)/2) || (i==n-1 && j<(n-1)/2) ||
//						(j==(n-1)/2 && i>0 && i!=(n-1)/2 && i<n-1)) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
				//O
//				if((i==n/4 && j>n/4 && j<(3*n)/4) || (j==n/4 && i>n/4 && i<(3*n)/4) || (i==(3*n)/4 && j>n/4 && j<(3*n)/4)
//						|| (j==(3*n)/4 && i>n/4 && i<(3*n)/4)) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//				//G
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//			if((i==0 && j>0 && j<(3*n)/4) || 
//				(j==0 && i>0 && i<n-1) ||
//				(i==n-1 && j>0 && j<(n-1)/2) ||
//                (i==(n-1)/2 && j>=(n-1)/2 && j<=(3*n)/4) || 
//                (j==(3*n)/4 && i>=(n-1)/2) || 
//                (j==(n-1)/2 && i>=(n-1)/2)) {
//				System.out.print("*");
//			}else {
//				System.out.print(" ");
//			}
			
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i+j==(n-1)/2 || i-j==(n-1)/2 || j-i==(n-1)/2 || i+j==n-1+(n-1)/2 || i==j || i+j==n-1
						|| i==0 || j==0 || i==n-1 || j==n-1) {
					System.out.print("*");
					}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	
			
		}
}

