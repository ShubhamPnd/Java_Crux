package patterns;

import java.util.Scanner;

public class pattern_6 {
    public static void main(String[] args) {
		System.out.println("Pattern 6 (The Hidden Diamond)");
		
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		
		int no_of_spaces = 1;
		int no_of_stars = num/2+1;
		
	     for (int i = 1;i <= num ;i++ ){
	          for (int j = 1;j <= no_of_stars ;j++ ){
	               System.out.print("*\t");
	          } 
	          for (int j = 1;j <= no_of_spaces ;j++ ){
	               System.out.print("\t");
	          } 
	          
	          for (int j = 1;j <= no_of_stars ;j++ ){
	               System.out.print("*\t");
	          } 
	          
	          if(i <= num /2){
	               no_of_spaces+=2;
	               no_of_stars--;
	          }else{
	               no_of_spaces-=2;
	               no_of_stars++;
	          }
	          System.out.println();
         } 
         scn.close();
	}
}
