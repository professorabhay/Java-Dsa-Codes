package Sorting;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        // int[] arr = {5,4,3,2,1};
        int[] arr = {1,2,3,4,5};
        bubblt(arr);
        System.out.println(Arrays.toString(arr));
        
    }

    static void bubblt(int[] arr){
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                // Swapping
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
    
}
