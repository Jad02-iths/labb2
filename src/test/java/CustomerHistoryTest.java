import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import labb2.Customer;

public class CustomerHistoryTest {

    // ny kund ska ha tom historik
    @Test
    void newCustomerShouldHaveEmptyHistory() {
        Customer customer = new Customer("Alice");
        assertTrue(customer.getHistory().isEmpty());
    }
}
