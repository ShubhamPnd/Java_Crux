import java.util.Scanner;

public class counter {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int counter = 1;
        int n = scn.nextInt();
        while(counter <= n) {
            System.out.println("This is Shubham Pandey");
            counter++;
        }
        System.out.println("Bye you are outside the while loop");
        scn.close();
    }
}
