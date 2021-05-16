package com.example.java;
import java.util.Scanner;

public class Taking_Input {
    public static void main(String[] args) {
        System.out.println("Taking Input from the user.");
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number one ");
        int num1 = scn.nextInt();
        System.out.println("Enter Number two");
        int num2 = scn.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum of these numbers is:" + sum);
//        boolean b1 = scn.hasNextInt(); It is used to check the validity of the datatype that it belongs to the specified value or not.
//        System.out.println(b1);
//        String str = sc.next(); It only prints the single word of the Sentence
        String str = scn.nextLine();
        System.out.println(str);
//        float f = scn.nextFloat();
//        System.out.println(f);
    }
}
