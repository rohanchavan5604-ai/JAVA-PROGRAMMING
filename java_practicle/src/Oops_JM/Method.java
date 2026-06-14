package Oops_JM;

import java.util.Scanner;

class Addition{
	
	int num1 ,num2, sum;
	
	void calculate(int a, int b) {
		
		num1 =a;
		num2 = b;
		
		sum = num1 + num2;
		
	}
	
	void display() {
		
		System.out.println("Addition is: "+sum);
		
	}
} 

public class Method {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Addition add = new Addition();
		
		System.out.println("Enter Two Numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		add.calculate(a,b);
		add.display();
		
		
		
	}
	
}
