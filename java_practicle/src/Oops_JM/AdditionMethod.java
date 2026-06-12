package Oops_JM;

import java.util.Scanner;

class addition {

	Scanner sc = new Scanner(System.in);

	void add() {
		
		System.out.println("Enter Two number for Addition: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int add = n1 + n2;
		System.out.println("Addition Of " + n1 + " And " + n2 + " is: " + add);

	}

	void Sub() {
		
		System.out.println("Enter Two number for Subtraction: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int sub = n1 - n2;
		System.out.println("Subtraction Of " + n1 + " And " + n2 + " is: " + sub);

	}
	
	void mul() {
		
		System.out.println("Enter Two number for Multiplication: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int mul = n1 * n2;
		System.out.println("Multiplicatin Of " + n1 + " And " + n2 + " is: " + mul);

	}
	
	void div() {
		
		System.out.println("Enter Two number for Division: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int div = n1 / n2;
		System.out.println("Multiplicatin Of " + n1 + " And " + n2 + " is: " + div);

	}
}

class subtraction {

	Scanner sc = new Scanner(System.in);

	void Sub() {
		
		System.out.println("Enter Two number for Subtraction: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int sub = n1 - n2;
		System.out.println("Subtraction Of " + n1 + " And " + n2 + " is: " + sub);

	}

}

public class AdditionMethod {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
	addition add = new addition();
    int choice;
    
	do {
	
     System.out.println("Calculator :-");
     System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Divition\n5.Exit\nEnter your Choice: ");
	
      choice = sc.nextInt();
 
     switch(choice) {
     case 1 -> add.add();  
     case 2 -> add.Sub();
     case 3 -> add.mul();
     case 4 -> add.div();
     case 5 -> System.out.println("Thank You!");
     default -> System.out.println("Invalid Choice");
     
     }
     
 	}while(choice != 5);
 
	}
}
