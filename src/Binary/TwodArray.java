package Binary;

import java.util.Arrays;

public class TwodArray {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {4,5,6},
        };
        int target = 6;
        System.out.println(Arrays.toString(twoD(arr, target)));
    }

    static int[] twoD(int[][] arr, int target){

        int r = 0;
        int c = arr[0].length - 1;
        
        while (r < arr.length && c >= 0) {
            if (arr[r][c] == target) {
                return new int[]{r,c};
            }
            if (arr[r][c] < target) {
                r++ ;
            } else {
                c--;
            }
        }
        return new int[]{-1,-1};
    }

}
