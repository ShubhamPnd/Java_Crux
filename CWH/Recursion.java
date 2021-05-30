package methods_in_java;

public class Recursion {
    // factorial(0) = 1;
    // factorial(n) = n * (n-1) * (n-2) *....* 1
    // factorial(5) = 5 x 4 x 3 x 2 x 1
    // Recursion : - factorial(n) = n * factorial(n-1)

    static int factorial_Recursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        else {
            return n * factorial_Recursive(n-1);
        }
    }

    static int factorial_Iterative(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        else {
            int product = 1;
            for (int i = 1; i < n ; i++) {
                product *= i;
            }
            return product;
        }
    }


    public static void main(String[] args) {
        System.out.println(factorial_Recursive(4));
        System.out.println(factorial_Recursive(5));
        System.out.println(factorial_Iterative(6));
        System.out.println(factorial_Iterative(8));
    }
}
