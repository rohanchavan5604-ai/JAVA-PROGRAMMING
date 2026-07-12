package com.Rohan;

public class LMS_Question {

	public static void main(String[] args) {

//		code a program to find the day of the week for a given day 'd',
//		month 'm' and year 'y'. return an integer from 1 (Monday) to 7 (Sunday).

		int d = 15;
		int m = 8;
		int y = 1998;

		System.out.println(myCode(d, m, y));

	}

	public static int myCode(int d, int m, int y) {

		java.util.Calendar cal = java.util.Calendar.getInstance();
		cal.set(y, m - 1, d);

		int day = cal.get(java.util.Calendar.DAY_OF_WEEK);

		switch (day) {
		case java.util.Calendar.MONDAY:
			return 1;
		case java.util.Calendar.TUESDAY:
			return 2;
		case java.util.Calendar.WEDNESDAY:
			return 3;
		case java.util.Calendar.THURSDAY:
			return 4;
		case java.util.Calendar.FRIDAY:
			return 5;
		case java.util.Calendar.SATURDAY:
			return 6;
		case java.util.Calendar.SUNDAY:
			return 7;
		}

		return -1;
	}

}
