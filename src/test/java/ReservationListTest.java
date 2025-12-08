import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import labb2.Booking;
import labb2.Restaurant;

public class ReservationListTest {

    @Test
    void customerShouldBeAddedToWaitingListWhenFullyBooked() {
        Restaurant restaurant = new Restaurant(2);

        Booking booking1 = new Booking(1);
        Booking booking2 = new Booking(2);
        Booking booking3 = new Booking(3); // överstiger

        restaurant.addBooking(booking1);
        restaurant.addBooking(booking2);

        restaurant.addBooking(booking3);

        assertEquals(1, restaurant.getWaitingList().size());
        assertTrue(restaurant.getWaitingList().contains(booking3));
    }
}
