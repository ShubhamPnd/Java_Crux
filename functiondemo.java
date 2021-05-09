public class functiondemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println(sum);

        int x = 20;
        int y = 30;
        int sum1 = x + y;
        System.out.println(sum1);

        System.out.println("Part_1: - Hey Here is the function sum with no parameters : ");
        sum();
        System.out.println("Part_2: - Function with parameters");
        add(26, 13);
        System.out.println("Part_3: - Function with Return Value");
        int addition = addReturn(40, 98);
        System.out.println(addition);

    }

    public static void sum() {
        int a = 19;
        int b = 98;
        int c = a + b;
        System.out.println(c);
    }

    public static void add(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    public static int addReturn(int a, int b) {
        return a + b;
    }
}
