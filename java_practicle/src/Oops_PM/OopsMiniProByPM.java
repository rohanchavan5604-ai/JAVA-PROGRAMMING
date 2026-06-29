package Oops_PM;

import java.util.Scanner;

class Bank123 implements Systems {
	Scanner sc1 = new Scanner(System.in);

	public void withdraw(double amount) {
		// System.out.println("withdraw = "+amount);
		System.out.println("Enter your amount to withdraw: ");
		double with = sc1.nextInt();
		if (with <= amount) {
			amount = amount - with;
			System.out.println("Amount after withdraw: " + amount);
		} else {
			System.out.println("Insufficient balance");
			System.out.println("Your current balance is :" + amount);
		}
	}

	public void deposite(double amount) {
		// System.out.println(deposite = "+amount);
		System.out.println("Enter your amount to deposite : ");
		double dep = sc1.nextInt();
		amount = amount + dep;
		System.out.println("Amount after deposite : " + amount);
	}

}

class Bank2 extends Bank123 {

	Bank2() {
		System.out.println("Welcome ABC Bank............!!!");
	}

	public void withdraw(double amount) {
		super.withdraw(amount);
	}

	public void deposite(double amount) {
		super.deposite(amount);
	}
}

public class OopsMiniProByPM {

	public static void main(String[] args) {

		double amount = 1000;
		System.out.println("Index: " + " \n1.withdraw " + "\n2.Deposite");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice: ");
		int ch = sc.nextInt();

		Bank2 b1 = new Bank2();
		switch (ch) {
		case 1:
			b1.withdraw(amount);
			break;
		case 2:
			b1.deposite(amount);
			break;

		default:
			System.out.println("Invalid choice");

		}

	}

}