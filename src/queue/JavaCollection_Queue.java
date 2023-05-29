package queue;

import java.util.LinkedList;
import java.util.Queue;

public class JavaCollection_Queue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        queue.add("IF2A");
        queue.add("IF2B");
        queue.add("IF2C");
        queue.add("IF21");

        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue.element());
        System.out.println(queue.peek());

        System.out.println("Remove dari antrian = " + queue.remove());
    }
}
