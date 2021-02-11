import Hotels.Booking;
import Hotels.Hotel;
import People.Guest;
import Rooms.Bedroom;
import Rooms.ConferenceRoom;
import Rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class HotelTest {
    Hotel hotel;
    Guest guest;
    Bedroom bedroom1;
    Bedroom bedroom2;
    Booking booking;

    ConferenceRoom conferenceRoom1;
    ConferenceRoom conferenceRoom2;
    ArrayList<Bedroom> bedrooms;
    ArrayList<ConferenceRoom> conferenceRooms;


    @Before
    public void before(){
        bedroom1 = new Bedroom(2, 44, RoomType.DOUBLE, 100);
        bedroom2 = new Bedroom(3, 77, RoomType.TRIPLE, 150);

        guest = new Guest("Billy");

        booking = new Booking(3, bedroom1);

        conferenceRoom1 = new ConferenceRoom(100, "Peppermint", 200);
        conferenceRoom2 = new ConferenceRoom(120, "Spearmint", 250);
        bedrooms = new ArrayList<Bedroom>();
        conferenceRooms = new ArrayList<ConferenceRoom>();

        bedrooms.add(bedroom1);
        bedrooms.add(bedroom2);
        conferenceRooms.add(conferenceRoom1);
        conferenceRooms.add(conferenceRoom2);
        hotel = new Hotel(bedrooms, conferenceRooms);

    }

    @Test
    public void hasBedrooms(){
        assertEquals(bedrooms, hotel.getBedrooms());
    }

    @Test
    public void hasConferenceRooms(){
        assertEquals(conferenceRooms, hotel.getConferenceRooms());
    }

    @Test
    public void checkInGuests(){
        hotel.addGuest(guest);
        Bedroom roomAddto = bedrooms.get(0);
        assertEquals(1, roomAddto.getGuests());
    }

    @Test
    public void checkOutGuests(){
        hotel.addGuest(guest);
        hotel.addGuest(guest);
        hotel.removeGuest(guest);
        Bedroom roomToLeave = bedrooms.get(0);
        assertEquals(1, roomToLeave.getGuests());
    }

    @Test
    public void canCreateBooking(){
        Booking testBooking = hotel.bookRoom(bedroom1, 3);
        assertEquals(3, testBooking.getNoOfNights());
    }

    @Test
    public void canIssueBill(){
        assertEquals(300, hotel.calculateBill(booking), 0.01);
    }



}
