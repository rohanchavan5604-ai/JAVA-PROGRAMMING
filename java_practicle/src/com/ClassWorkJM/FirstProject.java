package com.ClassWorkJM;

import java.util.Scanner;

public class FirstProject {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int pin = 1234;
		double balance = 10000.00;
		double MinBal = 1000;

		System.out.println("Enter PIN: ");
		int userPin = sc.nextInt();
		if (userPin == pin) {
			System.out.println("\nEnter Your Choice:");
			System.out.println("1) Check Balance");
			System.out.println("2) Withdraw Balance");
			System.out.println("3) Deposit Balance");

			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("Your Available Balance is: " + balance);

			} else if (choice == 2) {
				System.out.println("Enter Amount To Withdraw : ");
				double withdraw = sc.nextDouble();

				if (withdraw > 0 && (balance - withdraw) >= 1000) {
					balance = balance - withdraw;
					System.out.println("After Withdraw Available Balance is:" + balance);
				} else {
					System.out.println("Minimum balance Should be : " + MinBal);
				}
			} else if (choice == 3) {
				System.out.println("Enter Your Deposit Ammount : ");
				double deposit = sc.nextDouble();
				if (deposit > 0) {
					balance = balance + deposit;
					System.out.println("After Deposite Balance Is: " + balance);
				} else {
					System.out.println("Enter a Valid Amount");
				}
			} else {
				System.out.println("Enter a Valid Choice");
			}
		} else {
			System.out.println("Invalid PIN");
		}

		
	}
}