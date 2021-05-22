package arrays;

public class IsArray_Sorted {
    public static void main(String[] args) {
        int []arr = {1,2,321,4,5,6};
        boolean isSorted = true;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if (isSorted){
            System.out.println("The Array is sorted");
        } else {
            System.out.println("The Array is not sorted");
        }
    }
}
