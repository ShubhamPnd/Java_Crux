package Loop;

import java.util.Scanner;

public class For_Loop {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = 1; i <=n; i++) {
            System.out.println(i);
        }

        int m = scn.nextInt();

        for (int j = m; j > 0  ; j--) {
            System.out.println("Shubham"+j);
        }
        System.out.println("You are out from For Loop");
    }

}
