import java.util.Scanner;

public class conditional_Demo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        System.out.println("Hello!!!");
        if(a<b){
            System.out.println("IN If Condition"); 
        } else {
            System.out.println("in else condition");
        }
        scn.close();
    }
}
