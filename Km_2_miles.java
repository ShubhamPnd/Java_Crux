package com.example.java;

import java.util.Scanner;

public class Km_2_miles {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float km = scn.nextFloat();
        float miles = km * 0.62137f;
        System.out.println("Miles:"+miles);
    }
}
