import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


import labb2.Booking;
import labb2.PaymentStatus;

/*Test 3/3, man ska inte kunna betala två gånger för samma bokning */

public class payingTwiceShouldThrowException{

    @Test
    void payingTwiceShouldThrowException() {
        Booking booking = new Booking();
        booking.pay();
        
        assertThrows(IllegalStateException.class, () -> {
            booking.pay();
        });
    }
}