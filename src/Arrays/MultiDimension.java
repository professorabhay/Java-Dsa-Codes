package Arrays;

import java.util.Arrays;

public class MultiDimension {
    public static void main(String[] args) {
        int [][] arr = new int[2][2];
        int value = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = value ++ ;
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
