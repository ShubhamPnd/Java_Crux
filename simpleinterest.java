import java.util.Scanner;

public class simpleinterest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int principal = scn.nextInt();
        int rate = scn.nextInt();
        int year = scn.nextInt();
        int simple_interest = (principal*rate*year)/100;
        System.out.println("The Simple Interest is: " + simple_interest);
        scn.close();
    }
}
