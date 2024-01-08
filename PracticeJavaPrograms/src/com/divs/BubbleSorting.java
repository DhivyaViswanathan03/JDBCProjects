package com.divs;

import java.util.Scanner;

public class BubbleSorting {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter length of the string");
		int n=input.nextInt();
		int a[]=new int[n];
		System.out.println("Enter array of elements:");
		for(int i=0;i<n;i++) {
			a[i]=input.nextInt();
		}
		
		int temp;
		for(int i=0;i<n;i++) {
			for(int j=1;j<n-i;j++) {
				if(a[j]<a[j-1]) {
					temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				
			}
		}
		}
		System.out.println("Elements are sorted:");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}

	}

}
