import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

import javafx.scene.layout.Priority;

public class CollectionFrameworks {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(20);
        list.add(20);
        // list.add("abhay");

        List<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(10);
        linkedList.add(10);
        linkedList.add(10);
        linkedList.remove(1); // its take index

        Vector<String> vector = new Vector <String>();
        vector.add("a");
        vector.add("a");
        vector.add("a");
        vector.add("a");
        // vector is thread safe means only one work at a time.

        // Stack -> First In Last Out ! Push POP Peak

        Stack<Integer> stack = new Stack<Integer>();
        stack.push(50); 
        stack.push(50); 

        // Set = ? 
        // HashSet
        Set<Integer> set = new HashSet<Integer>();
        set.add(10);
        set.add(10);
        set.add(16);
        set.add(16);
        set.add(2);
        System.out.println(set);

        //LinkedHashSet -> No order change 
        LinkedHashSet<Integer> llset = new LinkedHashSet<Integer>();
        llset.add(5);
        llset.add(2);
        llset.add(2);
        llset.add(10);
        System.out.println(llset);

        //TreeSet
        TreeSet<Integer> tset = new TreeSet<Integer>();
        tset.add(20);
        tset.add(10);
        tset.add(10);
        tset.add(10);
        tset.add(100);
        tset.add(23);

        //queue
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.offer(20);
        queue.offer(202);
        queue.offer(201);
        queue.offer(200);
        queue.offer(100);
        queue.poll();
        System.out.println(queue);

        //Deque
        //ArrayDeque
        Deque<Integer> adq = new ArrayDeque<Integer>();
        adq.offer(10);
        adq.offerLast(20);
        adq.offerFirst(11);
        adq.offer(12);
        System.out.println(adq);

        //PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(12);
        pq.offer(122);
        pq.offer(13);
        pq.offer(4); 

        // HAshMap
        // TreeMap
        TreeMap<String, Integer> tmap = new TreeMap<String, Integer>();
        tmap.put("First", 20);
        tmap.put("First", 10);

        int[] arr = {1,20,3,23,44,2,11};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); 

    }
}
