package arrays;

public class Marks_Students {
    public static void main(String[] args) {
//        int [] marks = new int[5];
        int [] marks;
        marks = new int[5];
        // int [] marks = {100,40,32,20,98}
        marks[0] = 45;
        marks[1] = 87;
        marks[2] = 98;
        marks[3] = 90;
        marks[4] = 98;
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[1]);
        System.out.println(marks.length);
    }
}
