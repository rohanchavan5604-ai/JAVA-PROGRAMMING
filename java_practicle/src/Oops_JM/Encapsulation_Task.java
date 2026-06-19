package Oops_JM;

class Bank_Task {

	private String name;
	private double amt;
	public String getName() {
		
		return name;
		
	}

	public void setName(String n) {
		name = n;
	}

	public double getAmt() {
		
		return amt;
	}

	public void setAmt(double a) {
		
		if (a >= 1000) {
			amt = a;
			
		}
	}
}

public class Encapsulation_Task {
	
	public static void main(String[] args) {

		Bank_Task b = new Bank_Task();

		b.setName("Rohan");
		b.setAmt(4000);

		System.out.println("Name : " + b.getName());
		System.out.println("Balance : " + b.getAmt());

		b.setAmt(500);
		System.out.println("Balance : " + b.getAmt());
	}
}
