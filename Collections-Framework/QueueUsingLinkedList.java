import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingLinkedList
{

    public static void main(String[] args) 
    {

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(12); // add element
        queue.offer(24);
        queue.offer(36);

        System.out.println(queue);

        // System.out.println(queue.peek()); // tell next out element

        // queue.poll(); // removeing element

        // System.out.println(queue);

    }
}
