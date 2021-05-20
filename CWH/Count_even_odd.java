package GFGJavaProblem.Java_Crux;

import java.util.Scanner;

public class Count_even_odd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int []arr = new int[5];
        int n = arr.length;
        int countOdd = 0;
        int countEven = 0;
        for (int i = 0;  i < n; i++) {
            arr[i] = scn.nextInt();
        }
        for (int i = 0;  i < n ; i++) {
            System.out.print(arr[i] + "\t");
            System.out.println();
            if (arr[i] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        System.out.println(countEven);
        System.out.println(countOdd);


    }
}
