package com.divs;

import java.util.Scanner;

public class TwoSum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int target=s.nextInt();
		int inputs[]= {2,7,11,15};
		for(int i=0;i<inputs.length;i++) {
			for(int j=i+1;j<inputs.length;j++) {
				if((inputs[i]+inputs[j])==target) {
					System.out.println(i+","+j);
				}
			}
		}
		

	}

}
