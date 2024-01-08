package com.divs;

import java.util.Scanner;

//Find Duplicates
public class A2Program1 {
	public static void main(String args[]) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter length of the array:");
	int n=input.nextInt();
	int a[]=new int[n];
	System.out.println("Enter of array of "+n+" elements:");
	for(int i=0;i<n;i++) {
		a[i]=input.nextInt();
	}
	findDuplicates(a,n);
}

	private static void findDuplicates(int[] a, int n) {
		System.out.println("Duplicate elements are:");
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]==a[j]) {
					System.out.print(a[i]+" ");
					break;
				}
			}
		}
		
	}
}
