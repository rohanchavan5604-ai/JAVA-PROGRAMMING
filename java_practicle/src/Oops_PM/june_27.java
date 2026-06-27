package Oops_PM;

import java.util.Scanner;

class Bank {

	Scanner sc1 = new Scanner(System.in);

	void withdraw(double amount) {

		System.out.println("Enter Amount to Withdraw: ");
		double with = sc1.nextDouble();

		if (with <= amount) {

			amount = amount - with;
			System.out.println("Amount After Withdraw: " + amount);
		} else {
			System.out.println("Insufficient Balance........!");
			System.out.println("Your Current Balance is: " + amount);
		}
	}

	void deposit(double amount) {

		System.out.println("Enter Amount to Deposite ");
		double dep = sc1.nextDouble();
		amount = amount + dep;
		System.out.println("Amount After Deposite: " + dep);
	}

}

class Bank1 extends Bank {

	void withdraw(double amount) {

		super.withdraw(amount);
	}

	void deposit(double amount) {

		super.deposit(amount);

	}
}

public class june_27 {

	public static void main(String[] args) {

		// index

		Scanner sc = new Scanner(System.in);

		Bank1 b1 = new Bank1();

		double amount = 1000;
		System.out.println("Index:\n1.withdraw \n2.deposite\nEnter Your Choice: ");
		int ch = sc.nextInt();

		switch (ch) {

		case 1:
			b1.withdraw(amount);
			break;
		case 2:
			b1.deposit(amount);
			break;
		default:
			System.out.println("Invalid Choice");

		}

	}

}
