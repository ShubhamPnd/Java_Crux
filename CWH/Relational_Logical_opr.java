package com.example.java;

import java.util.Scanner;

public class Relational_Logical_opr {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("----------------------For Logical AND operation----------------");
        boolean a = scn.nextBoolean();
        boolean b = scn.nextBoolean();
        if(a && b){
            System.out.println("YES");
        } else
        {
            System.out.println("No");
        }


        System.out.println("--------------------For Logical OR Operation---------------------");
        boolean x = scn.nextBoolean();
        boolean y = scn.nextBoolean();

        if(x||y){
            System.out.println("YES");
        } else
        {
            System.out.println("No");
        }

        System.out.println("---------------For Logical NOT-----------------------------------");
        boolean m = scn.nextBoolean();
        boolean n = scn.nextBoolean();
        System.out.println("logical not of a is: " + !m);
        System.out.println("logical not of b is:" + !n);
    }
}
