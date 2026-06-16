package Oops_JM;

import java.util.Scanner;

class Bank{
	
	Scanner sc = new Scanner(System.in);
	
	String accountHolderName;
	long accountNumber;
	double balance;
	
	Bank()
 {
	accountHolderName = "Unknown";
	accountNumber = 0;
	balance = 0.0;
 }
	
	Bank(String name, long AcNo, double bal){
		
		accountHolderName = name;
		accountNumber = AcNo;
		balance = bal;		
	}
	
	void deposit(double d) {
	 
	    balance = balance+ d;
	}
	
	void withdraw(double w) {
	 
	    balance = balance - w;
	}
	
	void display() {
		
		System.out.println("Account Holder Name: "+accountHolderName);
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Account Balance: "+balance);
		
	    System.out.println("After Deposit avl Bal:"+balance);
	    System.out.println("After Withdraw avl bal: "+balance);
	    
	   


		
	}
	
}

public class ConstructorTask {

	public static void main(String[] args) {
		
		Bank b1 = new Bank();
		b1.display();
	
		
		System.out.println("=========================================");
		
		Bank b2 = new Bank("Rohan", 919392,10000.00);
		b2.deposit(3000);
		b2.withdraw(2000);
		b2.display();
		
		
	}
	
}
