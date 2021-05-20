package GFGJavaProblem.Java_Crux;

import java.util.Scanner;

public class Count_the_Specials {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int k = scn.nextInt();
        int []arr = new int[5];
        int n = arr.length;
        int f = (int) Math.floor(n/k);
        int count = 0;
        for (int i = 0;  i < n; i++) {
            arr[i] = scn.nextInt();
        }
        for (int i=0;i<n;i++){
            if (arr[i]>0)
            {
                for(int j=i+1;j<n;j++)
                {
                    if(arr[i]==arr[j])
                        count++;
                }
                if (count==f)
                {
                    System.out.println(count);
                }
            }
        }
    }
}
