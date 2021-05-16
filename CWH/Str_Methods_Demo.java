package com.example.java;

import java.util.Locale;
import java.util.Scanner;

public class Str_Methods_Demo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String testingString = scn.nextLine();

        int value = testingString.length();
        System.out.println(value);

        String lString = testingString.toLowerCase();
        System.out.println(lString);

        String uString = testingString.toUpperCase();
        System.out.println(uString);

        String nonTrimmedString = "        Brown Munde       ";
        System.out.println(nonTrimmedString);

        String trimmedString = nonTrimmedString.trim();
        System.out.println(trimmedString);

        System.out.println(testingString.substring(3));
        System.out.println(testingString.substring(5,8));

        System.out.println(testingString.replace('h' , 'b'));
        System.out.println(testingString.replace("s" , "ier"));

        System.out.println(testingString.startsWith("Shubh"));
        System.out.println(testingString.endsWith("boy"));

        System.out.println(testingString.charAt(14));

        System.out.println(testingString.indexOf("bham"));
        System.out.println(testingString.indexOf("is",5));
        System.out.println(testingString.lastIndexOf("good",6));

        String str = "Shubham";
        System.out.println(str.equals("shubham"));
        System.out.println(str.equalsIgnoreCase("ShubhAm"));



    }
}
