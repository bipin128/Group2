package com.vastika;

import com.vastika.controller.AccountController;

import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) {
		AccountController controller = new AccountController();
		Scanner input = new Scanner(System.in);
		String decision = "";

		do {
			System.out.println("-----------------------------");
			System.out.println("Welcome to Java Training Bank");
			System.out.println("--------------------------------");
			System.out.println("What would you like to do today?");
			System.out.println("--------------------------------");
			System.out.println(
					"1. Open Account (Press 1)\n2. Deposit (Press 2)\n3. Withdraw (Press 3)\n4. Check Balance (Press 4)");
			System.out.println("---------------------------");
			String choice = input.next();

			switch (choice) {
			case "1":
				controller.openAccount(input);
				break;
			case "2":
				controller.deposit(input);
				break;
			case "3":
				controller.withdraw(input);
				break;
			case "4":
				controller.showAll(input);
				break;
			default:
				System.out.println("Wrong choice!!! Please try again later.");
				break;
			}
			System.out.println("-----------------------------------");
			System.out.println("Would you like to use our service?");
			System.out.println("-----------------------------------");
			decision = input.next();
		} while (decision.equalsIgnoreCase("yes"));
		System.out.println("-----------------------------------------------");
		System.out.println("Thank you for using our service. See you again!");
		System.out.println("-----------------------------------------------");

	}
}