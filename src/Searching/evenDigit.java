package Searching;

public class evenDigit {
    public static void main(String[] args) {
        int[] nums = {22,13,1,2,44,322};
        System.out.println(findNumbers(nums));

    }
    static int findNumbers(int[] nums){
        int count = 0;
        for (int num : nums){
            if (even(num)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int numofdigits = digits(num);
        return numofdigits % 2 == 0;
    }

    static int digits(int num) {
        if (num < 0){
            num = num * -1;
        }
        if (num == 0){
            return 1;
        }
        int count = 0;

        while(num > 0 ) {
            count ++;
            num /= 10;
        }
        return count;
    }
}
