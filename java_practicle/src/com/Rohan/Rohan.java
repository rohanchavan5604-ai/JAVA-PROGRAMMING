package com.Rohan;

import java.util.Scanner;

public class Rohan {

    int id;
    java.lang.String name;
    java.lang.String location;
    int age;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Rohan rc = new Rohan();

        System.out.println("Enter Your Id: ");
        rc.id = sc.nextInt();
        sc.nextLine();   // Consume newline

        System.out.println("Enter Your Name: ");
        rc.name = sc.nextLine();

        System.out.println("Enter Your Location: ");
        rc.location = sc.nextLine();

        System.out.println("Enter Your Age: ");
        rc.age = sc.nextInt();

        System.out.println("Id Is: " + rc.id);
        System.out.println("Name Is: " + rc.name);
        System.out.println("Location Is: " + rc.location);
        System.out.println("Age Is: " + rc.age);

        sc.close();
    }
}