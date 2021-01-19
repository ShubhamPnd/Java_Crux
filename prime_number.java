import java.util.Scanner;

public class prime_number {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        boolean flag = true;
        int divisor = 2;
        while(divisor <= num-1){
            if(num % divisor == 0){
                flag = false;
            }
            divisor = divisor+1;
        }
        if(flag == true){
            System.out.println("prime");
        } else {
            System.out.println("non prime");
        }
    scn.close();
    }
}
