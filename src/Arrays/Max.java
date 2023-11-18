package Arrays;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(max(arr));
    }

    static int max(int[] arr){
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
