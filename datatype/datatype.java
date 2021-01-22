package datatype;

public class datatype {
    public static void main(String[] args) {
        byte b = 10;
        short sh = 20;
        int in = 30;
        long ln = 40;
        
        // b = sh; not possible to convert the small datatype to big one
        // b = in; b/c bytes is of 1 byte , short is for 2 bytes and similarly , integer has 4 ytes
        // b = ln;

        sh = b;
        System.out.println(sh);

        // sh = in; //not possible
        //sh = ln;

        in = b;
        System.out.println(in);
        in = sh;
        System.out.println(in);

        //in = ln; //not possible

        ln = b;
        System.out.println(ln);
        ln = sh;
        System.out.println(ln);
        ln = in;
        System.out.println(ln);


    }
}
