import java.util.*;

public class reverse_number {
    public static void main(String[] args) {
		System.out.println("To reverse the given number");
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number of your choice which is to be reversed");
		int number = scn.nextInt();
		
		while(number!=0){
		     
		     int digit = number % 10;
		     number=number/10;
		     System.out.print(digit);
        }
        scn.close();
	}
}
