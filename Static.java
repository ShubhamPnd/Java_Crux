class GFG {
 

    // static method

    public static int sum(int a, int b)

    {

        return a + b;

    }
}
 

class Main {

    public static void main(String[] args)

    {

        int n = 3, m = 6;
 

        // call the static method

        int s = GFG.sum(n, m);
 

        System.out.print("sum is = " + s);

    }
}
