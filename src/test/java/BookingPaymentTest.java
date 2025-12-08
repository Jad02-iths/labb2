import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


import labb2.Booking;
import labb2.PaymentStatus;

/*Test 1/3, när man bokar så ska betalstatus vara UNPAID */
public class BookingPaymentTest {
    
    @Test
    void newBookingShouldBeUnpaid(){
        Booking booking = new Booking(2);
        assertEquals(PaymentStatus.UNPAID, booking.getPaymentStatus());
    }
}
