import java.util.Scanner;

public class sum_n_natural_numbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int sum = 0;
        int counter = 1;

        while(counter<=n){
            sum=sum+counter;
            counter++;
        }
        System.out.println("The Sum of first n natural numbers is: "+sum);
        scn.close();
    }
}
