package Loop;

import java.util.Scanner;

public class Break_Continue {
    public static void main(String[] args) {
        // Break and Continue demonstration using Loops in Java !!!
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
//        for (int i = 0; i < n; i++) {
//            System.out.println(i);
//            System.out.println("Lets travel together and spread lots of love");
//            if (i == 4){
//                System.out.println("Ending The loop Here!!");
//                break;
//            }
//        }

        for (int i = 0; i < n; i++) {
            if (i == 4){
                System.out.println("Skip Iteration 4 and move to next Iteration!!");
                continue;
            }
           System.out.println(i);
           System.out.println("Lets travel together and spread lots of love!!");
        }

//        int i = 0;
//        while (i <= n){
//            System.out.println(i);
//            System.out.println("Lets DIve In");
//            if (i == 4){
//                System.out.println("Ending The loop Here!!");
//                break;
//           }
//            i++;
//        }

//        int i = 0;
//        do {
//            System.out.println(i);
//            System.out.println("Lets DIve In");
//            if (i == 4){
//                System.out.println("Ending The loop Here!!");
//                break;
//            }
//            i++;
//        }
//        while (i <= n);
    }
}
