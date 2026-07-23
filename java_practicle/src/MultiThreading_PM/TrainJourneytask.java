package MultiThreading_PM;

class Test38 extends Thread {

	public void run() {

		try {

			System.out.println("Train Start");
			Thread.sleep(2000);

			System.out.println("Mandai Reached");
			Thread.sleep(3000);

			System.out.println("court Reached");
			Thread.sleep(5000);

			System.out.println("PCMC Reached");
		 

		} catch (Exception e) {

			System.out.println("Program is Disturbed");

		}

	}

}

public class TrainJourneytask {

	public static void main(String[] args) {

		Test38 t = new Test38();
		t.start();
	}

}
