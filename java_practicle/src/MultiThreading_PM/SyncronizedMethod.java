package MultiThreading_PM;

class test111 {

	public void display() {

		System.out.println("Before");

		synchronized(this) {
			for (int i = 1; i <= 3; i++) {

				System.out.println(Thread.currentThread().getName()+" "+i);

			}
		}
		System.out.println("After");

	}

}

class test112 extends Thread {

	test111 t = new test111();

	public void run() {

		t.display();


	}

}

public class SyncronizedMethod {

	public static void main(String[] args) {

		test112 t1 = new test112();
		t1.start();

		test112 t2 = new test112();
		t2.start();

	}
}
