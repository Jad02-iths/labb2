package labb2;


import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    private int maxCapacity;
    private List<Booking> bookings = new ArrayList<>();
    private List<Booking> waitingList = new ArrayList<>();

    public Restaurant(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public void addBooking(Booking booking) {
        if (bookings.size() < maxCapacity) {
            bookings.add(booking);
        } else {
            waitingList.add(booking);
        }
    }

    public List<Booking> getWaitingList() {
        return waitingList;
    }

    public List<Booking> getBookings() {
        return bookings;
    }
}
