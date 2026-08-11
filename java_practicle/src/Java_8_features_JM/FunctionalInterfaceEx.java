package Java_8_features_JM;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
 

public class FunctionalInterfaceEx {

	public static void main(String[] args) {
		
		System.out.println("------------Supplier Interface------------");

		Supplier<Double> ran = () -> Math.random();

		System.out.println("Random Number : " + ran.get());
		
		
		System.out.println("\n------------Consumer Inteface------------");
		
		Consumer<String> ro=(r) -> System.out.println(r);
		ro.accept("\nRohan Chavan Bastawade");
		

		System.out.println("\n------------Predicate Inteface------------");

		Predicate<Integer> even = (n) -> n % 2 == 0;

		System.out.println("Even : " + even.test(36));

		
		System.out.println("\n==========================================");
		
		

		Predicate<Integer> age = (a) -> a >= 18;

		Boolean result = age.test(21);

		if (result) {
			System.out.println("ELigible");
		} else {
			System.out.println("Not Eligible");
		}

		
		
//		BiFunction functional Interface sub function of Function Interface
//		Use case:- Used when 2 inputs generate  1 results in function

		System.out.println("\n------------Functional Inteface------------");

		
		
		System.out.println("\n================For String==================");

		BiFunction<String, String, String> name = (a, b) -> a + b;

		System.out.println("Name : " + name.apply("Rohan ", "Chavan"));

		
		
		System.out.println("\n================For Integer==================");

		BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;

		System.out.println("Addition : " + add.apply(20, 80));

	}

}
