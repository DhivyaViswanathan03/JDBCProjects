package com.divs;

import java.util.Scanner;

//Bubble sort
public class A2Program3 {
	
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter length of the array:");
		int n=input.nextInt();
		int a[]=new int[n];
		System.out.println("Enter of array of "+n+" elements:");
		for(int i=0;i<n;i++) {
			a[i]=input.nextInt();
		}
		bubbleSort(a,n);
		
		for(int arr:a) {
			System.out.print(arr+" ");
		}

	}
	private static void bubbleSort(int[] a, int n) {
		int temp;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					}
			}
		}
		}

}
