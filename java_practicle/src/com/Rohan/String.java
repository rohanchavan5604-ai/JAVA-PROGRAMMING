package com.Rohan;

public class String {

    public static void main(java.lang.String[] args) {

        java.lang.String s = "qwertyudbbfjjiopasdfgabbfhhkrjdrchjehjklzxcvbnm";

        boolean[] arr = new boolean[26];

        for (int i = 0; i < s.length(); i++) {

            char ch = Character.toLowerCase(s.charAt(i));

            if (ch >= 'a' && ch <= 'z') {
                arr[ch - 'a'] = true;
            }
        }

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]) {
                count++;
            }
        }

        if (count == 26) {
            System.out.println("Pangram");
        } else {
            System.out.println("Not Pangram");
        }
    }
}