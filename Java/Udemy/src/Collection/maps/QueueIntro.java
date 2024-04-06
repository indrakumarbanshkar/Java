package Collection.maps;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueIntro {
    public static void main(String args[])
    {
        Queue<String> pq = new PriorityQueue<>();

        pq.add("indra");
        pq.add("kumar");
        pq.add("banshkar");

        System.out.println("Initial Queue " + pq);

        pq.remove("indra");

        System.out.println("After Remove " + pq);

        System.out.println("Poll Method " + pq.poll());

        System.out.println("Final Queue " + pq);
    }
}
