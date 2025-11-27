import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import labb2.Booking;
import labb2.PaymentStatus;

/*Test 2/3, man ska kunna betala för den bokning man gjorde */

public class shouldBeAbleToPayForBooking {

    @Test
    void shouldBeAbleToPayForBooking(){
        Booking booking = new Booking();
        booking.pay();
        assertEquals(PaymentStatus.PAID, booking.getPaymentStatus());
    }
}
