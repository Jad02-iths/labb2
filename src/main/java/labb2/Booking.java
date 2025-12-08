package labb2;

import java.util.ArrayList;
import java.util.List;

public class Booking {
    private int capacity;
    private PaymentStatus paymentStatus;
    private List<String> confirmedBookings = new ArrayList<>();
    private List<String> waitingList = new ArrayList<>();
    private int numberOfGuests = 1; 

    public Booking(int capacity){
        this.paymentStatus = PaymentStatus.UNPAID;
        if (capacity < 0) throw new IllegalArgumentException("capacity must be >= 0");
        this.capacity = capacity;
    }

    public PaymentStatus getPaymentStatus(){
        return paymentStatus;
    }

    public void pay(){
        if(this.paymentStatus == PaymentStatus.PAID){
            throw new IllegalStateException("Booking is already paid");
        }
        this.paymentStatus = PaymentStatus.PAID;
    }

    public void setNumberOfGuests(int guests) {
        if (guests <= 0) {
            throw new IllegalArgumentException("Guest count must be > 0");
        }
        this.numberOfGuests = guests;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public void book(String name) {
        if (confirmedBookings.size() < capacity) {
            confirmedBookings.add(name);
        } else {
            waitingList.add(name);
        }
    }

     public void cancelBooking(String name) {
        boolean removed = confirmedBookings.remove(name);

        if (removed && !waitingList.isEmpty()) {
            String next = waitingList.remove(0);
            confirmedBookings.add(next);
        }
    }

     public List<String> getConfirmedBookings() {
        return confirmedBookings;
    }

    
    public List<String> getWaitingList() {
        return waitingList;
    }
}
