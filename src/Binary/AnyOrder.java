package Binary;

import java.util.Scanner;

public class AnyOrder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print("Enter Target: ");
        int target = in.nextInt();
        if (arr[0] < arr[arr.length - 1]){
            System.out.println(binarySearchAsc(arr, target));
        } else {
            System.out.println(binarySearchDes(arr, target));
        }
    }

    static int binarySearchAsc(int[] arr, int target){
        int start = 0;
        int end  = arr.length -1 ;
        while (start <= end){
            int mid  = start + (end - start) / 2 ;
            if (target  < arr[mid]) {
                end  = mid -1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
    static int binarySearchDes(int[] arr, int target){
        int start = 0;
        int end  = arr.length -1 ;
        while (start <= end){
            int mid  = start + (end - start) / 2 ;
            if (target  < arr[mid]) {
                start = mid + 1;
            } else if (target > arr[mid]) {
                end  = mid -1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
