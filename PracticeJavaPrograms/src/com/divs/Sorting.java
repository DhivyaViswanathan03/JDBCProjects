package com.divs;

public class Sorting {

	public static void main(String args[]) {
		int a[]= {7,5,2,3,1,4,6};
		int temp;
		
		for(int i=0;i<a.length;i++) {
			for(int j=1;j<a.length-i;j++) {
				if(a[j]<a[j-1]) {
					temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
			}
		}
		
		for(int ele:a) {
			System.out.print(ele +" ");
		}
	}
}
