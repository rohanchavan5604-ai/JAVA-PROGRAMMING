package Java_8_features_JM;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamApi {

	public static void main(String[] args) {

		List<Integer> numlist = Arrays.asList(1, 2, 3, 4, 5, 6);

		// map() - Square of each number
		List<Integer> square = numlist.stream()
				.map(n -> n * n)
				.toList();

		System.out.println("Square : " + square);

		System.out.println("----------------------------------------");

		// filter() - Print even numbers
		numlist.stream()
				.filter(n -> n % 2 == 0)
				.forEach(System.out::println);

		System.out.println("----------------------------------------");

		// count() - Count even numbers
		long count = numlist.stream()
				.filter(n -> n % 2 == 0)
				.count();

		System.out.println("Even Numbers Count : " + count);

		System.out.println("----------------------------------------");

		// max() - Find maximum number
		List<Integer> numlistt = Arrays.asList(1, 4, 6, 8, 2, 5);

		Optional<Integer> max = numlistt.stream()
				.max(Integer::compare);

		System.out.println("Maximum : " + max.get());

		System.out.println("----------------------------------------");

		// reduce() - Sum of all numbers
		List<Integer> sum = Arrays.asList(2, 4, 5);

		int ans = sum.stream()
				.reduce(0, (n1, n2) -> n1 + n2);

		System.out.println("Sum : " + ans);

		System.out.println("----------------------------------------");

		// reduce() - Concatenate Strings
		List<String> names = Arrays.asList("Rohan", "Java", "Developer");

		String result = names.stream()
				.reduce("", (s1, s2) -> s1 + " " + s2);

		System.out.println("Concatenated String :" + result);
	}
}