import java.util.Scanner;
public class else_if_demo {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int age = scn.nextInt();
        if (age<=11){
            System.out.println("Child");
        } else if(age >= 12 && age <= 17){
            System.out.println("Teenager");
        } else if(age >= 18 && age <= 30){
            System.out.println("Adult");
        } else if(age >= 30 && age <= 55){
            System.out.println("Gentle");
        } else if(age >= 55 && age <= 70){
            System.out.println("Old");
        } else {
            System.out.println(" SO Old");
        }
        scn.close();
    }
}
