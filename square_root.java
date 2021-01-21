import java.util.Scanner;

public class square_root {
    public static void main(String[] args) {
		System.out.println("Square root of a number");
		
		Scanner scn = new Scanner(System.in);
		double x = scn.nextDouble();
		
		double y = Math.sqrt(x);
		
        System.out.println("Y=" + y);
        scn.close();
	}
}
