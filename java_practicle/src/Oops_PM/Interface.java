package Oops_PM;

public class Interface implements third, second, first {

	@Override
	public void show() {

		System.out.println("First");
	}

	@Override
	public void get() {

		System.out.println("Second");
	}

	@Override
	public void display() {
		System.out.println("Third");

	}

	public static void main(String[] args) {

		Interface t1 = new Interface();
		t1.display();
		t1.get();
		t1.show();
		
	}

}
