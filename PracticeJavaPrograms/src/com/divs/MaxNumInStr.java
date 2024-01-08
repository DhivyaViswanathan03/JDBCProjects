package com.divs;

public class MaxNumInStr {
	public static void main(String[] args) {
		String str[]= {"alice and bob love leetcode","i think so too s s s s s","this is great thanks very much"};
		int max=0;
		for(int i=0;i<str.length;i++) {
			if(sente(str[i])>max) {
				max=sente(str[i]);
			}
			
		}
		System.out.println(max);
	}

	private static int sente(String string) {
		String str[]=string.split(" ");
	    return str.length;
	}
	

}
