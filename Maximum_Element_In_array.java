package arrays;

public class Maximum_Element_In_array {
    public static void main(String[] args) {
        int []arr = {1,12,3,4,5,6};
        int max = 0;
        for (int element:
             arr) {
            if(element > max) {
                max = element;
            }
        }

        System.out.println("The Maximum Element in the array is:" + max);
    }
}
