import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import labb2.TakeawayQueue;

public class TakeawayQueueTest {

    // kö nummer
    @Test
    void newOrderShouldGetIncrementingQueueNumber() {
        TakeawayQueue queue = new TakeawayQueue();

        int first = queue.addOrder();
        int second = queue.addOrder();

        assertEquals(1, first);
        assertEquals(2, second);
    }
    @Test
    void nextOrderShouldReturnOrdersInCorrectOrder(){
        TakeawayQueue queue = new TakeawayQueue();

        queue.addOrder(); // 1
        queue.addOrder(); // 2
        queue.addOrder(); // 3

        assertEquals(1, queue.nextOrder());
        assertEquals(2, queue.nextOrder());
 }
}
