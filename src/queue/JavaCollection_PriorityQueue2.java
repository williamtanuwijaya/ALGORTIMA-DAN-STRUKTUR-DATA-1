package queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class JavaCollection_PriorityQueue2 {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<String>();
        Comparator<String> panjangString = new Comparator<String>() {
            @Override
            public int compare(String S1, String S2) {
                return 0;
            }
        };
        pq.add("");
        pq.add("Apel");
        pq.add("Mangga");
        pq.add("Rambutan");
        System.out.println(pq);
        while (!pq.isEmpty()){
            System.out.println(pq.remove());
        }
    }
}
