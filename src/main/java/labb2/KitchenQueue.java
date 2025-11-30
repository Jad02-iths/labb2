package labb2;

import java.util.LinkedList;

import java.util.Queue;

public class KitchenQueue {

    private Queue<Order> waitingQueue = new LinkedList<>();

    public void addOrder(Order order) {
        waitingQueue.add(order);
        order.setStatus(OrderStatus.WAITING);
    }

    public Order startNextOrder() {
        Order order = waitingQueue.poll(); // ta första
        if (order != null) {
            order.setStatus(OrderStatus.IN_PROGRESS);
        }
        return order;
    }

    public void markOrderDone(Order order) {
        order.setStatus(OrderStatus.DONE);
    }
}
