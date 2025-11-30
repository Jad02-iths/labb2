package labb2;

public class Order {
    private OrderStatus status = OrderStatus.WAITING;

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus newStatus) {
        this.status = newStatus;
    }
}
