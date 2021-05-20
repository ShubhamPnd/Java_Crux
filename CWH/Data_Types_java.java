package GFGJavaProblem.Java_Crux;

public class Data_Types_java {
    public static void main(String[] args) {
        dataTypes(2,4 , 8,16, (byte) 32);
    }

    static void dataTypes(int a , float b, double c, long l, byte d){
        double p = c/b;
        double q = b/a;
        double r = c/a;
        double s = r+l;
        int t = a/d;

        System.out.println(p + " " + q + " " + r + " " + s + " " + t);
    }
}
