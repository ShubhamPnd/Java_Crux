package com.example.java;

import java.util.Scanner;

public class Practice_Set_4_CWH {
    public static void main(String[] args) {
        Scanner scn =  new Scanner(System.in);
        // Question 2:
//        byte b1 , b2 , b3;
//        System.out.println("Enter marks in first subject");
//        b1 = scn.nextByte();
//        System.out.println("Enter marks in second subject");
//        b2 = scn.nextByte();
//        System.out.println("Enter marks in third subject");
//        b3 = scn.nextByte();
//        float avg = (b1+b2+b3)/3.0f;
//        System.out.println("Your overall percentage is:"+avg);
//        if(avg >= 40 && b1 >= 33 && b2 >= 33 && b3 >= 33){
//            System.out.println("Congrats, You are Promoted");
//        } else {
//            System.out.println("You are not promoted !! Please Try again");
//        }

        // Question 3;
//        System.out.println("Enter you income in lakhs");
//        float tax = 0;
//        float income = scn.nextFloat();
//        if (income <= 2.5){
//            tax = tax + 0;
//        } else if (income > 2.5f && income <= 5.0f){
//            tax = tax + 0.05f * (income - 2.5f);
//        }
//        else if (income > 5f && income <= 10.0f){
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (income - 5f);
//        } else if (income > 10f){
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (10.0f - 5f);
//            tax = tax + 0.3f * (income - 10.0f);
//        }
//
//        System.out.println("The total tax paid by the employee is:" + tax);

        // Question 4:
//        int day = scn.nextInt();
//        switch (day){
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//        }

        // Question no. 5 : - Leap Year
//        int year = scn.nextInt();
//        boolean leap = false;
//
//        if( year % 4 == 0){
//            if (year % 100  == 0){
//                if (year % 400 == 0) {
//                    leap = true;
//                }
//                else {
//                    leap = false;
//                }
//            } else {
//                leap = true;
//            }
//        }
//        else {
//            leap = false;
//        }
//
//        if(leap){
//            System.out.println(year + " is a LEAP Year");
//        } else {
//            System.out.println(year + " isn't a LEAP Year");
//
//       }

        //Question 6:
        String website = scn.nextLine();
        if(website.endsWith(".org")){
            System.out.println("This is an organizational Website");
        } else if (website.endsWith(".com")){
            System.out.println("This is a Commercial Website");
        } else if (website.endsWith(".in")){
            System.out.println("This is an Indian Website");
        } else
            System.out.println("Wrong Input");
    }
}
