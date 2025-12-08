package labb2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Customer {

    private String name;
    private List<Booking> history = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public List<Booking> getHistory() {
        return history;
        // return Arrays.asList(new Booking());
    }

}
