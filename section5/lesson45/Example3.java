package section5.lesson45;

import java.util.LinkedList;
import java.util.Queue;

public class Example3 {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        System.out.println(queue.remove()); // Output: 1
        System.out.println(queue.remove()); // Output: 2
        System.out.println(queue.remove()); // Output: 3
    }
}
