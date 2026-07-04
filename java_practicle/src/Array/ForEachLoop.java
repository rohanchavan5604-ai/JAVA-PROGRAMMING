package Array;

public class ForEachLoop {

	public static void main(String[] args) {

		int arr[] = { 10, 30, 20, 34 };
		int r[][] = { { 1, 2, 3 }, { 2, 6, 1 }, { 3, 2, 5 } };
		String name[] = { "Rohan", "Tushar", "Om", "Aniket", "Sunit", "Shubham", "Prathmesh", "Pranay" };

		System.out.println("Single Array Element Print Using Foreach: ");

		for (int a : arr) {

			a = a * a;
			System.out.println("Square: " + a);

		}

		System.out.println("Two D Array Element Print Using Foreach: ");

		for (int[] r1 : r) {
			for (int v : r1) {

				System.out.print(v + " ");

			}
			System.out.println();

		}

		System.out.println("Single String Array Name's Print Using Foreach: ");

		for (String n : name) {
			System.out.println("Name: " + n);
		}
	}

}
