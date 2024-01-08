package com.divs;

import java.util.Scanner;

class InvalidCustomerException extends Exception {
	InvalidCustomerException(String message) {
		super(message);
	}
}

class Atm {
	int userId = 111;
	int password = 1234;
	int uid;
	int pwd;

	public void Input() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter user id:");
		uid = input.nextInt();
		System.out.println("Enter the passowrd:");
		pwd = input.nextInt();
	}

	public void Verify() throws InvalidCustomerException {
		if (userId == uid && password==pwd) {
			System.out.println("Take a cash");
		} else {
			InvalidCustomerException ice = new InvalidCustomerException("Invalid Input Try again ");
			System.out.println(ice.getMessage());
			throw ice;

		}
	}

}

public class UserDefinedException {

	public static void main(String[] args) {
		Atm a = new Atm();

		try {
			a.Input();
			a.Verify();
		} catch (InvalidCustomerException e) {

			try {
				a.Input();
				a.Verify();
			} catch (InvalidCustomerException e1) {
				try {
					a.Input();
					a.Verify();
				} catch (InvalidCustomerException e2) {

					System.out.println("You are not valid user card is blocked");
				}
			}
		}

	}

}
