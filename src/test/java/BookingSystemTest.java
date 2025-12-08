    import org.junit.jupiter.api.Test;
    import static org.junit.jupiter.api.Assertions.*;

    import labb2.Booking;
    
    class BookingSystemTest {
    
        @Test
        void customerIsAddedToWaitingListWhenSessionIsFull() {
            Booking system = new Booking(2);
    
            system.book("Anna");
            system.book("Erik");
            system.book("Maria"); // now Maria should go to waiting list
            assertTrue(system.getWaitingList().contains("Maria"));

        }
    
        @Test
        void firstInWaitingListGetsSpotWhenSomeoneCancels() {
            Booking system = new Booking(2);
    
            system.book("Anna");
            system.book("Erik");
    
            system.book("Maria"); // reservlista
            system.book("Oskar"); // reservlista
    
            system.cancelBooking("Anna");
    
            // Maria ska flyttas från reservlista till ordinarie
            assertTrue(system.getConfirmedBookings().contains("Maria"));
            assertFalse(system.getWaitingList().contains("Maria"));
        }
    }