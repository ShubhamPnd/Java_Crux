package arrays;

public class Methods_in_java {
    static int mySumSub(int x , int y) {
        int z;
        if(x > y ){
            z = x - y;
        } else {
            z = x + y;
        }
        return  z;
    }
    public static void main(String[] args) {
        int c = mySumSub(4,7);
        System.out.println(c);
    }
}
