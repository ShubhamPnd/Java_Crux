package arrays;

public class Two_Matrices_sum {
    public static void main(String[] args) {
        int [][]matrix1 = {{1,2,3}, {4,5,6}};
        int [][]matrix2 ={{7,8,9},{8,9,10}};
        int [][]result = {{0,0,0},{0,0,0}};
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.format("Setting Value for i=%d and j=%d\n",i,j);
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(result[i][j] + " ");
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
            System.out.println("");
        }
    }
}
