package Searching;

import java.util.Scanner;

public class Linear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print("Enter Target: ");
        int target = in.nextInt();
        System.out.println(linear(arr, target));
        System.out.println(range(arr,target));
        System.out.println(min(arr));
        System.out.println(max(arr));
    }
    static int linear(int [] arr, int target){

        if (arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    static int range(int[] arr, int target){
        int start = 3;
        int end = 9;
        for (int i = start; i <= end ; i++) {
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    static int min(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return  min;
    }

    static int max(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return  max;
    }
}
