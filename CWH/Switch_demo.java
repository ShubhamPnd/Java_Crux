package com.example.java;

import java.util.Scanner;

public class Switch_demo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        switch (str) {
            case "Shubham" -> {
                System.out.println("You are best.");
            }
            case "Shivam" -> {
                System.out.println("You are good.");
            }
            case "Saurabh" -> {
                System.out.println("You are bad");
            }
            default -> System.out.println("------Enjoy Your Life-----");
        }
    }
}
