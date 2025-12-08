package labb2;

import java.util.LinkedList;
import java.util.Queue;

public class TakeawayQueue {

    private int counter = 0;
    private Queue<Integer> queue = new LinkedList<>();

    public int addOrder() {
        counter++;
        queue.add(counter);
        return counter;
    }

    public int nextOrder() {
        Integer next = queue.poll();
        if (next == null) {
            throw new IllegalStateException("No orders in queue");
        }
        return next;
    }
}
