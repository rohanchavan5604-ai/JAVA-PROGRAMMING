package com.ClassWorkJM;

import java.util.Scanner;

public class ChoiceHomeWork {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//	3. JAVA PROGRAM FOR ONLINE FOOD ORDER	
		
		
		System.out.println("1. pizza \n2. burger \n3. pasta \n4. sandwich \nEnter Your Menu:  ");
		String choice = sc.nextLine();
		
		switch (choice) {
		case "pizza": System.out.println("Pizza \nTotal Bill: 250"); break;
		case "burger": System.out.println("Burger \nTotal Bill: 120"); break;
		case "pasta": System.out.println("Pasta \nTotal Bill: 180");	break;
		case "sandwich":System.out.println("Sandwich \nTotal Bill: 100"); break;
		default: System.out.println("Enter An Valid Choice");
		}
		
 	
		
		
		
//	2. JAVA PROGRAM FOR A PET CARE CENTER USING SWITCH
		
//		System.out.println("1. pet grooming \n2. vaccination \n3. pet checkup \n4. pet boarding \n Enter Your Service:  ");
//		String choice = sc.nextLine();
//		
//		switch(choice) {
//		case "pet grooming": System.out.println("Pet Grooming \nService Price: ₹500"); break;
//		case "vaccination": System.out.println("Vaccination\nService Price: ₹1200"); break;
//		case "pet checkup": System.out.println("Pet Checkup \nService Price: ₹800"); break;
//		case "pet boarding": System.out.println("Pet Boarding \nService Price: ₹2000"); break;
//		default: System.out.println("Enter An Valid Choice");
//		
//		}
		
		
		
		
//	1.	JAVA PROGRAM FOR METRO TICKET BOOKING USING SWITCH
		
		
//		System.out.println("1. mumbai Central \n2. andheri \n3. borivali \n4. churchgate \n Enter Your City:  ");
//		String choice = sc.nextLine();
//		
//		switch(choice) {
//		case "mumbai Central": System.out.println("Mumbai Station and Ticket Price: ₹20"); break;
//		case "andheri": System.out.println("Andheri Station and Ticket Price: ₹30"); break;
//		case "borivali": System.out.println("Borivali Station and Ticket Price: ₹40"); break;
//		case "churchgate": System.out.println("Churchgate Station and Ticket Price: ₹25"); break;
//		default: System.out.println("Enter An Valid Choice");
//		
//		}
		
		
	}
}
