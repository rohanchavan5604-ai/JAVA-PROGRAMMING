package Java_8_features_JM;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lambda_With_Arr {

	public static void main(String[] args) {

		int arr[] = { 2, 5, 3, 8 };

		
		System.out.println("-----Function Square Return-----");
		
		Function<Integer, Integer> sqrt = (num) -> num * num;

		for (int s : arr) {

			System.out.println(sqrt.apply(s));

		}

		
		System.out.println("-----Predicate  Odd Chk-----");
		
		Predicate<Integer> odd = (s) -> s % 2 != 0;

		for (int s : arr) {

			if (odd.test(s)) {
				System.out.println(s);
			}
		}

		
		System.out.println("-----Consumer Print Array Elements-----");
		
		
		Consumer<Integer> arrl = (num) -> System.out.println(num);
		
		for(int x: arr) {
			arrl.accept(x);
		}
		
		
		System.out.println("-----Supplier Print Array Elements-----");
		
		Scanner sc = new Scanner(System.in);
		
		int arr1 [] = new int[5];
		
		Supplier<Integer> sarr = () -> sc.nextInt();
		
		for(int i=0; i<arr1.length; i++) {
			System.out.println("Enter Array Elements: ");
			arr1[i] = sarr.get();
			
		}
		System.out.println("Array Elements are: ");
	    for(int r:arr1) {
		System.out.println(r);
	    }
	    
	    
	}

}
