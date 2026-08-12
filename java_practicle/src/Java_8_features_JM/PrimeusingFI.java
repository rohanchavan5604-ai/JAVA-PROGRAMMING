package Java_8_features_JM;

import java.util.function.Predicate;

public class PrimeusingFI {

	public static void main(String[] args) {

		Predicate<Integer> prime = n -> {
			if (n < 2)
				return   false;
			for (int i = 2; i < n; i++)
				if (n % i == 0)
					return false;
			return true;
		};
		System.out.println(prime.test(7));

	}

}
