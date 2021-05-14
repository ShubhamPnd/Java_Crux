package com.example.java;

import java.util.Scanner;

public class Age_Switch_Demo {
    public static void main(String[] args) {
        Scanner scn =  new Scanner(System.in);
        int age = scn.nextInt();

        if(age >= 56){
            System.out.println("You are experienced!!");
        }
        else if (age > 46){
            System.out.println("You are semi-experienced");
        } else if (age > 36){
            System.out.println("You are semi-semi-experienced");
        } else {
            System.out.println("You are not experienced");
 }
//        if(age > 2) {
//            System.out.println("you are mot a baby");
//        }
    }
}
