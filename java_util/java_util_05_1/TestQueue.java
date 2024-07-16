import java.util.*;

public class TestQueue {
    public static void main(String args[]) {
        
        // Create a Queue of Integers using LinkedList
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        // Displaying the Queue
        System.out.println("Queue elements: " + queue.peek());
    }
}
