package MultiThreading_PM;

class test12 extends Thread {

	public void run() {

		for (int i = 1; i <= 3; i++) {

			System.out.println(Thread.currentThread().isInterrupted());
			System.out.println(Thread.currentThread().isDaemon());
			System.out.println(Thread.currentThread().getThreadGroup());
			

		}

	}

}

public class DaemonThread {

	public static void main(String[] args) {

		test12 t = new test12();

		t.setDaemon(true);
		t.interrupt();
		t.start();

		test12 t1 = new test12();
		t1.start();

	}

}
