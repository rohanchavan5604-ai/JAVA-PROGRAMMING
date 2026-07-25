package Exeption_Handling_JM;

public class ArrayIndOutOfBond {

	public static void main(String[] args) {

		try {
			int arr[] = { 1, 2, 3 };
			System.out.println(arr[4]);
		} catch (Exception e) {
			System.out.println(e);
		}

		try {
			String arr1[] = { "Rc", "Rohan" };
			System.out.println(arr1[3]);
		} catch (Exception e) {
			System.out.println(e);
		}

		try {
			String name = "Rohan";
			System.out.println(name.charAt(5));
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("Program End Successfully");
	}
}