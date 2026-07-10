package Array_PM;

public class FrequencyOfCharArray {

	public static void main(String[] args) {

		char ch[] = { 'a', 'f', 'a', 'a', 'r', 'f' };

		for (char i = 'a'; i <= 'z'; i++) {

			int c = 0;

			for (int j = 0; j < ch.length; j++) {

				if (i == ch[j]) {

					c++;

				}

			}
			if (c != 0) {
				System.out.println(i+" frequency is: "+c);
			}

		}
	}

}
