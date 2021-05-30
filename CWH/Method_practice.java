package methods_in_java;

public class Method_practice {


    // Practice Problem 1:--
    static void multiplication(int n) {
        for (int i = 1; i <=10 ; i++) {
            System.out.format(" %d X %d = %d\n" , n ,i , n*i);
        }
    }

    //  Practice Problem 2:--
    static void pattern(int n) {
        for (int i = 0; i <=n ; i++) {
            for (int j = 1; j < i+1 ; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }

    //  Practice Problem 3:--
    // sum(n) = 1+2+3+4..+n
    // sum(n) = 1+2+3+....+(n-2)+(n-1)+n
    // sum(n) = sum(n-1) + n
    // sum(3) = 3 + sum(2)
    // sum(3) = 3 + 2 + sum(1)
    // sum(3) = 3 + 2 + 1
    static int sumRect(int n) {
        // Base Condition
        if(n == 1){
            return 1;
        }
        return n + sumRect(n-1);
    }

    //  Practice Problem 4:--
    static void pattern2(int n) {
        for (int i = n; i > 0 ; i--) {
            for (int j = i + 1; j > 1 ; j--) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }

    //  Practice Problem 4:--  Using Recursion
    // Fibonacci Series : - 0,1,1,2,3,5,8,13,21,34
     static int fib(int n){
      /*  if(n == 1){
            return 0;
        } else if (n == 2){
            return 1;
        }*/
      if(n == 1 || n == 2)
    {
        return n - 1;
    }
        else {
            return fib(n-1) + fib(n-2);
        }
     }

     // Problem set 5 -- >
    // Average using var args
     static float average(int ...arr) {
//        Available as int[] arr
         float avg = 0;
         for (float element:arr) {
             avg = ((avg+element)/arr.length);
         }
         return avg;
     }

//      Problem set 8: -
//     Pattern 1 : using recursion
    // pattern_rec(3)
    // pattern_rec(2) + 3 times star and new line
    // pattern_rec(1) + 2 times star and new line + 3 times star and new line
    // pattern_rec(0) + 1 time star and new line + 2 times star and new line + 3 times star and new line


    static void pattern_rec(int n) {
        if(n > 0) {
            pattern_rec(n - 1);
            for (int i = 0; i < n ; i++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
      multiplication(3);
      System.out.println();
      multiplication(58);
      pattern(6);
      System.out.println();
      int x = sumRect(5);
      System.out.println(x);
      System.out.println();
      pattern2(7);
      System.out.println();
      int result = fib(8);
      System.out.println(result);
      System.out.println();
      float result2 = average(1,2,4,5,6,7);
      System.out.println(result2);
      System.out.println();
      pattern_rec(5);
    }
}
