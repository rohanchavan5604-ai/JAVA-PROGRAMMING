package MultiThreading_PM;

class test34 extends Thread {

	public void run() {
		get();
		for (int i = 1; i <= 3; i++) {
			show();
			System.out.println("run");
		}
	}

	void show() {
		System.out.println("Show");

	}

	void get() {
		System.out.println("Get");
	}

}

public class july_22 {

	public static void main(String[] args) {

		test34 t = new test34();
		t.start();

	}

}
