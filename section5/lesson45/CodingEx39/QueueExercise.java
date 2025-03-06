package section5.lesson45.CodingEx39;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExercise {

    public static void main(String[] args) {
        // Create a LinkedList-based Queue of Integers
        Queue<Integer> linkedListQueue = new LinkedList<>();
        // Should print []
        System.out.println("Initial LinkedList Queue: " + linkedListQueue);

        // TODO: Add the following elements to the linkedListQueue: 1, 2, 3
        linkedListQueue.offer(1);
        linkedListQueue.offer(2);
        linkedListQueue.offer(3);
        // Should print [1, 2, 3]
        System.out.println("After adding elements: " + linkedListQueue);

        // TODO: Remove an element from the linkedListQueue
        linkedListQueue.poll();
        // Should print [2, 3]
        System.out.println("After removing an element: " + linkedListQueue);

        // TODO: Peek at the first element of the linkedListQueue
        linkedListQueue.peek();
        // Should print 2
        System.out.println("First element (peek): " + linkedListQueue.peek());

        // Create a PriorityQueue of Integers
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        // Should print []
        System.out.println("Initial PriorityQueue: " + priorityQueue);

        // TODO: Add the following elements to the priorityQueue: 3, 1, 2
        priorityQueue.offer(3);
        priorityQueue.offer(1);
        priorityQueue.offer(2);
        // Should print [1, 2, 3]
        System.out.println("After adding elements: " + priorityQueue);

        // TODO: Remove an element from the priorityQueue
        priorityQueue.poll();
        // Should print [2, 3]
        System.out.println("After removing an element: " + priorityQueue);

        // TODO: Peek at the first element of the priorityQueue
        priorityQueue.peek();
        // Should print 2
        System.out.println("First element (peek): " + priorityQueue.peek());
    }
}

