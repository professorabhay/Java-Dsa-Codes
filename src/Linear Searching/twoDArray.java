package Searching;

public class twoDArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {344, 43, 55, 33},
                {18, 12}
        };
        int target = 43;
        System.out.println(search(arr, target));
    }

    static int search(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (target == arr[i][j]) {
                    System.out.println("Found");
                    return target;
                }
            }
        }
        return -1;
    }
}
