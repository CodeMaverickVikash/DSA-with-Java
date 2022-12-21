import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.Queue;

public class PriorityQueueClass
{

    public static void main(String[] args)
    {
        // min heap
        Queue<Integer> pq = new PriorityQueue<>();
        // PriorityQueue<Integer> pq = new PriorityQueue<>(); // same as above 

        // max heap
        // Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer(40);
        pq.offer(12);
        pq.offer(24);
        pq.offer(36);

        // System.out.println(pq);
        // System.out.println(pq.peek());

        // pq.poll();
        // System.out.println(pq);

        // for(Integer item : pq)
        //     System.out.println(item);

    }

}
