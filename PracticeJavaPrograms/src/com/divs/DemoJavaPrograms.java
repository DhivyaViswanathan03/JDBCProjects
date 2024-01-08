package com.divs;

import java.util.Scanner;

public class DemoJavaPrograms {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int inputs[]=new int[s.nextInt()];
		for(int i=0;i<inputs.length;i++) {
			inputs[i]=s.nextInt();
		}
		for(int i=0;i<inputs.length;i++) {
			System.out.println(inputs[i]);
		}
		
}
	

}
