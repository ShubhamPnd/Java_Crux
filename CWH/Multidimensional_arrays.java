package arrays;

public class Multidimensional_arrays {
    public static void main(String[] args) {
        //Array of Arrays
        // int [] marks : - A 1-D array
        int [] [] flats; // A 2_D array
        flats = new int[2][3]; // 2 floors 3 rooms
        flats[0][0]= 101; // GF
        flats[0][1]= 102;
        flats[0][2]= 103;
        flats[1][0]= 201;
        flats[1][1]= 202;
        flats[1][2]= 203;

        System.out.println("-------------The Naive Approach for Printing 2-d array-----");
        System.out.println(flats[0][2]);
        System.out.println(flats[1][2]);

        System.out.println("-------Now Printing 2-D Array with nested for loop--------------");
        for (int i = 0; i < flats.length; i++) {
            for (int j = 0; j < flats[i].length; j++) {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
