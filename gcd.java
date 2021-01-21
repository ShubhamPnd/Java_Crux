import java.util.*;

public class gcd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int divisor = scn.nextInt();
        int divident = scn.nextInt();

        while(divident % divisor != 0){
            int remainder = divident%divisor;
            divident = divisor;
            divisor = remainder;
        }

        System.out.println(divisor);//it contains the HCF
        scn.close();
    }
}
