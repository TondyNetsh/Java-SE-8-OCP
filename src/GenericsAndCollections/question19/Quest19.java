package GenericsAndCollections.question19;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Quest19 {
    public static void main(String[] args) {
        List<Integer> l = new LinkedList<>();
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(12);
        q.remove(1);
        l.add(10);
        l.add(12);
        l.remove(1);
        System.out.println(l);
        System.out.println(q);
    }
}

/*
A, D. A LinkedList implements both List and Queue. The List interface has a method to
remove by index. Since this method exists, Java does not autobox to call the other method.
Queue has only the remove by object method, so Java does autobox there. Since the number
1 is not in the list, Java does not remove anything for the Queue.
*/