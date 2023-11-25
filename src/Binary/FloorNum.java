package Binary;

public class FloorNum {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,9,14,16,18};
        int target = 15;

        System.out.println(Ceil(arr, target));
    }  

    static int Ceil(int[] arr, int target){
        int start = 0 ;
        int end = arr.length-1;

        while (start <= end) {
            int mid = start + (end - start)/2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return arr[end];
    }
}
