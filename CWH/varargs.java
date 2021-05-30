package methods_in_java;

public class varargs {
//    CASE1: By Method Overloading
//    static int sum(int a , int b){
//        return a + b;
//    }
//
//    static int sum(int a , int b, int c){
//        return a + b + c;
//    }
//
//    static int sum(int a , int b, int c , int d){
//        return a + b + c+ d;
//    }


//    CASE 2 : Variable Arguments

    static int sum(int ...arr) {
//        Available as int[] arr
        int result = 0;
        for (int element:arr) {
            result += element;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Varargs Tutorial");
//        System.out.println(sum(2,3));
//        System.out.println(sum(2,3,4));
//        System.out.println(sum(4,5,6,7));
//        System.out.println(sum( 1,2,3,4);
        System.out.println("The sum of the array value" + sum( 1,2,3,4));
        System.out.println(sum(2,4,5,6));
        System.out.println(sum());
    }
}
