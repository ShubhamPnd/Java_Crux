package com.example.java;

import java.util.Scanner;

public class CalculatePercentage {
    public static void main(String[] args) {
        System.out.println("Enter your marks to calculate the percentage:");
        System.out.println("Enter first subject mark");
        Scanner scn = new Scanner(System.in);
        float a = scn.nextFloat();
        System.out.println("Enter second subject mark");
        float b = scn.nextFloat();
        System.out.println("Enter third subject mark");
        float c = scn.nextFloat();
        System.out.println("Enter fourth subject mark");
        float d = scn.nextFloat();
        System.out.println("Enter fifth subject mark");
        float e = scn.nextFloat();
        float total = a + b + c + d + e;
        System.out.println("Your total marks is:" + total);
        float percentage = (total/500) * 100;
        float cgpa = (a + b+ c +d +e)/50;
        System.out.println("Your Percentage is:" + percentage);
        System.out.println("Your CGPA is :" + cgpa);
    }

}
