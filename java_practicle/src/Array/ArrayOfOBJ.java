package Array;

class customer {

	int custid;
	String custNm;
	float totalBillAmt;

	customer(int cid, String cnm, float tamt) {

		custid = cid;
		custNm = cnm;
		totalBillAmt = tamt;

	}

	void display() {

		System.out.println("Customer ID: " + custid);
		System.out.println("Customer Name: " + custNm);
		System.out.println("Total Bill: " + totalBillAmt + "\n");

	}

}

public class ArrayOfOBJ {

	public static void main(String[] args) {

		customer c[] = { new customer(1, "Rohan", 10000.00F), new customer(2, "Tushar", 150.00F),
				new customer(3, "Onkar", 50.00F) };

		for (customer x : c) {

			x.display();

		}

	}

}
