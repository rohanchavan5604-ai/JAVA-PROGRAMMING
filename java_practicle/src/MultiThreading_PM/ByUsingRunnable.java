package MultiThreading_PM;

class test3224 implements Runnable {

	public void run() {

		System.out.println(Thread.currentThread().getName());

	}

}

public class ByUsingRunnable {

	public static void main(String[] args) {

		test3224 t = new test3224();

		Thread t1 = new Thread(t);

		t1.start();

	}

}
