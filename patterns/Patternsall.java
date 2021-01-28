import java.util.*;

 class Patterns

 {

   public static void main(String args[])

   { 

     

     System.out.println("    *Currently 14 but more are to come*");

     System.out.println();

     

     System.out.println("Right angled triangle - all types");

     System.out.println();

     

    //first pattern

    System.out.println("(1)");

    System.out.println();

    for(int i = 1; i <= 5; i++)

    {

      for(int j = 1; j <= i; j++)

      System.out.print(j + " ");

      System.out.println();            

    }

   

    System.out.println();

    

    //second pattern

    System.out.println("(2)");

    System.out.println();

    for(int i = 1; i <= 5; i++)

    {

       int p,q = 1;      

       p = q;

    for(int j = 1; j <= i; j++)

    {

      System.out.print(p + " ");

      p += 2;      

    }   

    q+=2;    

    System.out.println();

    }

    

    System.out.println();

    

    //third pattern

    System.out.println("(3)");

    System.out.println();

    int p = 1;

    for(int i = 1; i <= 5; i++)

    {

      

    for(int j = 1; j <= i; j++)

    {

      System.out.print(p + " ");   

      p = p + 1;

    }          

    System.out.println();

    }

    

    System.out.println();

    

    //fourth pattern

    System.out.println("(4)");

    System.out.println();

    for(int i = 5; i >= 1; i--)

    {

      for(int j = 5; j >= i; j--)

      System.out.print(j + " ");

      System.out.println();            

    }
