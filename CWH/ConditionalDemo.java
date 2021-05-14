package com.example.java;

import java.util.Scanner;

public class ConditionalDemo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int age = scn.nextInt();

        if (age > 18) {
            System.out.println("Yes you are eligible and you can drive");
        }
        else {
            System.out.println("No Sorry you are not eligible to drive");
        }
    }
}
