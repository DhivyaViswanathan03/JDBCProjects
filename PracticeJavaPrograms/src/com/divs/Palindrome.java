package com.divs;

public class Palindrome {

	public static void main(String[] args) {
		int temp,r,n=5555;
		int sum=0;
		temp=n;
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
			}
		if(sum==temp) {
			System.out.println("Given input "+temp+" is a plaindrome");
		}else {
			System.out.println("Not a palindrome");
		}
		
		String s="ABCDCBA	",tempS="";
		for(int i=s.length()-1;i>=0;i--) {
			tempS=tempS+s.charAt(i);
		}
		if(tempS.equals(s)) {
			System.out.println("Given String "+s+" is palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}

	}

}
