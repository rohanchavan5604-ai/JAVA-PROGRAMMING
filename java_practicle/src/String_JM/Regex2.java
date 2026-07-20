package String_JM;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {

	public static void main(String[] args) {

//		Password validation

		String pass = "roHan9&5rc";
		String regx = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[#@&%]).{6,}$";

		if (pass.matches(regx))
			System.out.println("Corrct Password");
		else
			System.out.println("Incorrct password");

//		validate email

		String email = "rohanchavan5604@gmail.com";
		String regex = "^[A-Za-z0-9._]+@[a-z]+\\.[a-z]{2,}$";
		if (email.matches(regex)) {
			System.out.println("Email id is correct");
		} else {
			System.out.println("incorrect email");
		}

		String st = "Rohan  chavan 45 Bastawade 56";

//		replace spaces

		System.out.println(st.replaceAll("\\s", "-"));

//		remove digits

		System.out.println(st.replaceAll("\\d", " "));

		Pattern p = Pattern.compile("\\D++");// Big D return words &
												// small d return digits
		Matcher m = p.matcher(st);
		while (m.find()) {
			System.out.println(m.group());
		}

//		vehicle number check

		String vehicle = "MH11SB5604";
		System.out.println(vehicle.matches("[A-Z]{2}\\d{2}[A-Z]{2}\\d{4}"));

//		name check

		String name = "Rohan Chavan";
		System.out.println(name.matches("\\w[A-Za-z]+\\s+[A-Za-z]+"));
		System.out.println(name.matches("\\D+"));
	}

}
