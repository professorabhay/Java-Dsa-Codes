package Arrays;

import java.util.Arrays;

public class swaps {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
//        swap(arr, 1, 5);
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            swap(arr, start, end);
            start ++;
            end -- ;
        }
    }
    static void swap(int[] arr, int index1, int indexLast){
        int temp = arr[index1];
        arr[index1] = arr[indexLast];
        arr[indexLast] = temp;
    }
}
