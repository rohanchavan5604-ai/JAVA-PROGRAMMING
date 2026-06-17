package Oops_JM;

import java.util.Scanner;

class Bank_Account {

	int accountNumber;
	String customerName;
	String accountType;
	String branchName;
	double balance;

	Scanner sc = new Scanner(System.in);

	void acceptAccountDetails() {

		System.out.print("Enter Account Number: ");
		accountNumber = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter Customer Name: ");
		customerName = sc.nextLine();

		System.out.print("Enter Account Type: ");
		accountType = sc.nextLine();

		System.out.print("Enter Branch Name: ");
		branchName = sc.nextLine();

		System.out.print("Enter Balance: ");
		balance = sc.nextDouble();
	}

	void displayAccountDetails() {

		System.out.println("Account Number : " + accountNumber);
		System.out.println("Customer Name  : " + customerName);
		System.out.println("Account Type   : " + accountType);
		System.out.println("Branch Name    : " + branchName);
	}

	void showBalance() {

		System.out.println("Balance : " + balance);
	}
}

public class BankProgram {

	public static void main(String[] args) {

		Bank_Account b1 = new Bank_Account();
		Bank_Account b2 = new Bank_Account();

		System.out.println("Enter Details of Customer 1");
		b1.acceptAccountDetails();

		System.out.println("\nEnter Details of Customer 2");
		b2.acceptAccountDetails();

		System.out.println("\nCustomer 1 Details");
		b1.displayAccountDetails();
		b1.showBalance();

		System.out.println("\nCustomer 2 Details");
		b2.displayAccountDetails();
		b2.showBalance();

	}
}