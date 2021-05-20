package arrays;

public class arrays_demo {
    public static void main(String[] args) {
        int [] marks = {100,40,32,20,98};
        float [] flnumber = {20.5f,78.6f,76.4f,67.8f,8.4f};
        System.out.println(marks.length);
        // Displaying the Array (Naive Way)
        System.out.println("------------------Printing using Naive Method------------------");
        System.out.println(marks[3]);
        System.out.println(marks[2]);
        System.out.println(flnumber.length);
        System.out.println(flnumber[2]);
        System.out.println(flnumber[3]);
        String [] names = {"Shubham","Shivam","Swati","Shruti","Somya","Bhumi"};
        System.out.println(names.length);
        System.out.println(names[0]);
        System.out.println(names[2]);
        System.out.println(names[5]);
        System.out.println("------------------Printing using For Loop------------------");
        // Displaying the Array (for loop)
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        System.out.println("------------------------Reverse order of the Array-----------------------------");
        // Printing Array in Reverse order
        for (int j = marks.length-1; j >= 0 ; j--) {
            System.out.println(marks[j]);
        }

        System.out.println("-------------------Implementation of For Each Loop in Java----------------------");
        for (float element:
             flnumber) {
            System.out.println(element);
        }
    }
}
