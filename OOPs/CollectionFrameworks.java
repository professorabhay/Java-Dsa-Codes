import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

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
    }
}
