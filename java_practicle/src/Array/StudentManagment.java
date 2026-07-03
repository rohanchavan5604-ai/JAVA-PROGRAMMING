package Array;

import java.util.Scanner;

public class StudentManagment {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String deptData[][] = new String[4][2];

		String studName[] = new String[4];

		for (int i = 0; i < 4; i++) {

			System.out.println("Enter Details of Students ");

			System.out.print("Enter Department: ");
			deptData[i][0] = sc.nextLine();

			System.out.print("Enter Roll No: ");
			deptData[i][1] = sc.nextLine();

			System.out.print("Enter Student Name: ");
			studName[i] = sc.nextLine();
		}

		System.out.println("Department | Roll No | Student Name");

		for (int i = 0; i < 4; i++) {

			for (int j = 0; j < 2; j++) {
				System.out.print(deptData[i][j] + "  \t \t");
			}

			System.out.println(studName[i]);
		}

	}
}