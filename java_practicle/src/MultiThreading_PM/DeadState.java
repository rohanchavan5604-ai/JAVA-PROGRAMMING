package MultiThreading_PM;

class t2 extends Thread {

	public void run() {

		for (int i = 1; i <= 3; i++) {

			System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getState());

		}

		try {

		} catch (Exception e) {
			System.out.println("Exception occur");
		}

	}

}

public class DeadState {
	public static void main(String[] args) {

		t2 t = new t2();
		t.start();
 
	}
}
