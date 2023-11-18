package Arrays;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(2);

        list.add(0,2);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(5,15);

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list);
    }
}
