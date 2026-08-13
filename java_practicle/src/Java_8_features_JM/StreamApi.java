package Java_8_features_JM;

import java.util.Arrays;
import java.util.List;

public class StreamApi {

	public static void main(String[] args) {

		List<Integer> numlist = Arrays.asList(1, 2, 3, 4, 5, 6);

		numlist.stream().filter((n) -> n % 2 == 0).forEach(System.out::println);
	}

}
