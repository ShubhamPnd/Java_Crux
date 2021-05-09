import java.util.Scanner;

public class maxvalues {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        byte b = scn.nextByte();
        System.out.println("Byte : " + b);

        if (b < Byte.MAX_VALUE) {
            b++;
        }

        System.out.println("Byte : " + b);

        scn.close();
    }
}
