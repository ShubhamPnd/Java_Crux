package Loop;

import java.util.Scanner;

public class Do_While {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int i = 1;
        do {

            System.out.println(i);
            i++;
        }
        while (i <= n);

        System.out.println("Now! You are out from do-while Loop");
    }
}
