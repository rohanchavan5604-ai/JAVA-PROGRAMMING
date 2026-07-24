package Exeption_Handling_JM;

class t3 extends Thread {

	public void run() {

		try {
			for (int i = 1; i <= 3; i++) {

				System.out.println(Thread.currentThread().getName());
				Thread.sleep(3000);

			}
		} catch (Exception e) {

			System.out.println(e);
		}
	}

}

public class ThreadInterrupt {

	public static void main(String[] args) {

		t3 t = new t3();
		t.start();

		// use to disturb the particular thread from where sleep method is working

		t.interrupt();

		t3 t2 = new t3();
		t2.start();

	}

}
