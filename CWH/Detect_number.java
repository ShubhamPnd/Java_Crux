package com.example.java;

import java.util.Scanner;

public class Detect_number {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");
        System.out.println(scn.hasNextInt());
    }
}
