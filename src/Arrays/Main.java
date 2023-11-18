package Arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] rollNum = new int[10];
        rollNum[0] = 1;
        int[] id = {10,11,12,13,14,15,16,17,18,19,20};

        for (int i = 1; i <rollNum.length; i++) {
            rollNum[i] = rollNum[i-1]+1;
        }
        System.out.println(Arrays.toString(rollNum));

        for(int num: id) {
            System.out.println("ID: " + num);
        }
    }
}
