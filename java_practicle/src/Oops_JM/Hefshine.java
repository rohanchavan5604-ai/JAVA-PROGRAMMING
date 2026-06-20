package Oops_JM;

class Trainer5 extends Hefshine {

	void run() {

		System.out.println("hefshine & Trainer DownCasting ");

	}

	static void display(Hefshine a) {

		if (a instanceof Trainer5) {
			Trainer5 b1 = (Trainer5) a;
			b1.run();
		} else {
			System.out.println("Not child object");
		}
	}

}

public class Hefshine {

	public static void main(String[] args) {

		Hefshine t1 = new Trainer5();

		Trainer5.display(t1);

	}

}
