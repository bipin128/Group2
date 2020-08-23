package com.vastika;

import com.vastika.controller.AccountController;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        AccountController controller = new AccountController();
        Scanner input = new Scanner(System.in);
        String decision = "";

        do {

            System.out.println("which db operation do you want to perform? openAccount--deposit--withdraw--showAll");
            String choice = input.next();

            switch (choice) {
                case "openAccount":
                    controller.openAccount(input);
                    break;
                case "deposit":
                    controller.deposit(input);
                    break;
                case "withdraw":
                    controller.withdraw(input);
                    break;
                case  "showAll":
                    controller.showAll(input);
                    break;
                default:
                    System.out.println("wrong choice!!!");
                    break;
            }

            System.out.println("do you want to continue?");
            decision = input.next();
        } while (decision.equalsIgnoreCase("yes"));

        System.out.println("byye bye!!!Thank you for using our service.");

    }
}