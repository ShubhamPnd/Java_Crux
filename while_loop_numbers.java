import java.util.Scanner;

public class while_loop_numbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int counter = 1;
        int n = scn.nextInt();
        while(counter <= n) {
            System.out.println(counter);
            counter++;
        }
        scn.close();
    } 
}
