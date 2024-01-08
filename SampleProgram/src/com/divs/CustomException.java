package com.divs;

import java.util.Scanner;

class UnderAgedException extends Exception{
	UnderAgedException(String message){
		super(message);
	}
}

class OverAgedException extends Exception{
	OverAgedException(String message){
		super(message);
	}
}

class License{
	int age;
	public void input() {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Age :");
		age=input.nextInt();
	}
	
	public void verify() throws UnderAgedException,OverAgedException{
		if(age<18) {
			UnderAgedException uge=new UnderAgedException("Be calm,you have a time");
			System.out.println(uge.getMessage());
			throw uge;
		}else if(age>60) {
			OverAgedException oge=new OverAgedException("Your time is over");
			System.out.println(oge.getMessage());
			throw oge;
		}else {
			System.out.println("Please Proceed");
		}
	}
}
public class CustomException {

	public static void main(String[] args) {
		License li=new License();
		
		try {
			li.input();
			li.verify();
		} catch (UnderAgedException | OverAgedException e) {
			
			try {
				li.input();
				li.verify();
			} catch (UnderAgedException | OverAgedException e1) {
				try {
					li.input();
					li.verify();
				} catch (UnderAgedException | OverAgedException e2) {
					
					System.out.println("Not allowed to proceed..Invalid Input");
				}
				
			}
		}

	}

}
