package Oops_PM;

interface one11 {

// abstract + concrete
	void get();

// concrete -> implemented  
	default void show() {
		data();
		System.out.println("Show");
	}
	
	static void display() {
		System.out.println("Display");
	}
	
	private void data() {
		System.out.println("Data");
	}
	
}

class two12 implements one11 {
	public void get() {
		System.out.println("get");
	}
	
}

public class june_26 {

	public static void main(String[] args) {

		two12 t1 = new two12();

		t1.get();
		t1.show();
		one11.display();

	}

}
