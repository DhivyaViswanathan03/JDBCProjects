package com.divs;

import java.util.Scanner;

public class A2Program6 {
public static void main(String args[]) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter length of the 1st array:");
	int n1=input.nextInt();
	System.out.println("Enter length of the 2nd array:");
	int n2=input.nextInt();
	int a1[]=new int[n1];
	int a2[]=new int[n2];
	System.out.println("Enter 1st array elements:");
	for(int i=0;i<n1;i++) {
		a1[i]=input.nextInt();
	}
	System.out.println("Enter 2nd array of elements:");
	for(int i=0;i<n2;i++) {
		a2[i]=input.nextInt();
	}
	
	if(isSubSet(a1,a2,n1,n2)) {
		System.out.println("Array2 is subset of Array1");
	}else {
		System.out.println("Array2 is not subset of Array1");
	}
}

private static boolean isSubSet(int[] a1, int[] a2, int n1, int n2) {
	int i,j=0;
	for(i=0;i<n2;i++) {
		for(j=0;j<n1;j++) {
			if(a2[i]==a1[j]) {
				break;
			}
			
		}
		if(j==n1) {
			return false;
		}
		
	}
	return true;
	
}
}
