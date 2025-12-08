import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import labb2.Booking;

public class GroupBookingTest {

    @Test
    void shouldBeAbleToSetNumberOfGuests() {
        Booking booking = new Booking(8);
        booking.setNumberOfGuests(8);

        assertEquals(8, booking.getNumberOfGuests());
    }

    @Test
    void settingInvalidGuestCountShouldThrow() {
        Booking booking = new Booking(0);

        assertThrows(IllegalArgumentException.class, () -> {
            booking.setNumberOfGuests(0); 
        });
    }
}
