package Array;

import java.util.Scanner;

class customer1 {

	int custid;
	String custNm;
	float totalBillAmt;

	customer1(int cid, String cnm, float tamt) {

		custid = cid;
		custNm = cnm;
		totalBillAmt = tamt;
	}

	void display() {

		System.out.println("Customer ID : " + custid);
		System.out.println("Customer Name : " + custNm);
		System.out.println("Total Bill : " + totalBillAmt);
		System.out.println();
	}
}

public class ArrofObjAnatherway {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		customer1[] ob = new customer1[2];

		for (int i = 0; i < ob.length; i++) {

			System.out.println("Enter Customer ID:");
			int id = sc.nextInt();

			System.out.println("Enter Customer Name:");
			String name = sc.next();

			System.out.println("Enter Total Bill:");
			float bill = sc.nextFloat();

			ob[i] = new customer1(id, name, bill);
		}

		System.out.println("\nCustomer Details");

		for (int i = 0; i < ob.length; i++) {

			ob[i].display();
		}

	}
}