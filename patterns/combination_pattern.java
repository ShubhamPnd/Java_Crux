package patterns;

import java.util.Scanner;

public class combination_pattern {
    public static void main(String[] args) {
		System.out.println("Pattern Combination");
		
		Scanner scn = new Scanner(System.in);
		int number = scn.nextInt();
		
		for(int i = 0;i < number;i++){
		     int var = 1;
		     for (int j = 0;j <= i ;j++ ){
		          System.out.print(var+"\t");
		          var = (var*(i-j))/(j+1);
		     } 
		
		  System.out.println();
        }
        scn.close();
	}
}
