import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println("your entered number is "+n);
        double x = scn.nextDouble();
        System.out.println("your entered number is "+x);
        long l = scn.nextLong();
        System.out.println("your entered number is "+l);
        short s = scn.nextShort();
        System.out.println("your entered number is "+s);
        byte b = scn.nextByte();
        System.out.println("your entered number is "+b);
        String str = scn.nextLine();
        System.out.println("your entered string is "+str);
        char c = scn.nextLine().charAt(0);
        System.out.println("your entered character is "+c);
        scn.close();
    }
}
