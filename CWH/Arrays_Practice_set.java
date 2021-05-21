package arrays;

public class Arrays_Practice_set {
    public static void main(String[] args) {
        float [] marks = {34.5f,98.6f,89.6f,78.5f,33.7f};
        float sum = 0;
        for (float element:
             marks) {
            sum = sum+element;
        }
        System.out.println("The sum of the given marks is: " + sum);
    }
}
