
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import labb2.KitchenQueue;
import labb2.Order;
import labb2.OrderStatus;

public class KitchenQueueTest {
    // test 1, se till att det finns kö
    @Test
    void newOrderShouldStartAsWaiting() {
        KitchenQueue queue = new KitchenQueue();
        Order order = new Order();

        queue.addOrder(order);

        assertEquals(OrderStatus.WAITING, order.getStatus());
    }
    // test 2, om en order är klar måste nästa order hanteras
    @Test
    void startNextOrderShouldMoveOrderToInProgress() {
        KitchenQueue queue = new KitchenQueue();
        Order order = new Order();

        queue.addOrder(order);

        Order started = queue.startNextOrder();

        assertEquals(OrderStatus.IN_PROGRESS, started.getStatus());
        assertEquals(order, started);
    }

    // test 3, en order som är klar ska markeras som klar
    @Test 
    void markOrderDoneShouldSetStatusDone() {
        KitchenQueue queue = new KitchenQueue();
        Order order = new Order();

        queue.addOrder(order);
        queue.startNextOrder();
        queue.markOrderDone(order);

        assertEquals(OrderStatus.DONE, order.getStatus());
    }
}




