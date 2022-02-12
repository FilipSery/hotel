package com.engeto.hotel;
import java.util.ArrayList;
public class bookings {
    ArrayList<booking> bookings = new ArrayList<>();

    public void addBooking (booking newBooking) {
        bookings.add(newBooking);
    }

}
