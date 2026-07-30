package Exeption_Handling_JM;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class parseException {

	void dateprint() throws ParseException {
		SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
		Date d = date.parse("2026-07-30");
		System.out.println(date.format(d));

	}

	public static void main(String[] args) {

		parseException p = new parseException();

		try {
			p.dateprint();
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
