package Rooms;

import Hotels.Booking;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {
    Booking booking;
    Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(2, 42, RoomType.DOUBLE);
        booking = new Booking(3, bedroom);
    }

    @Test
    public void hasNoOfNights(){
        assertEquals(3, booking.getNoOfNights());
    }

}
