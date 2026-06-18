package Oops_JM;

class marks {

	private int marks;

	public String getMarks() {

		if (marks > 35) {
			return "Pass";
		} else {

			return "Fail";
		}
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

}

public class Encapsulation {

	public static void main(String[] args) {

		marks m1 = new marks();

		m1.setMarks(75);
		String result = m1.getMarks();
		System.out.println("Result : " + result);

	}

}
