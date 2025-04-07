package collection;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueImplementation {
    
    public static void main(String[] args) {

            // LinkedList Implementation
            // FIFO
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println(q);

       System.out.println(q.remove()); // or .poll();
       System.out.println(q.poll());

       // PriorityQueue Implenetation

       Queue<Integer> q2 = new PriorityQueue<>();
       q2.add(10);
       q2.add(20);
       q2.add(30);
       q2.offer(40);

       System.out.println(q2);

       System.out.println(q2.poll());
       System.out.println(q2.poll());
       System.out.println(q2.remove());





       
    }
}
