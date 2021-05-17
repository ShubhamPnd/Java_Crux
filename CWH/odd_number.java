package Loop;

import java.util.Scanner;

public class odd_number {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = 0; i <= n ; i++) {
            System.out.println(2*i+1);
        }
        System.out.println("End of Program");
    }
}
