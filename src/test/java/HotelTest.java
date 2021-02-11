import Buildings.Hotel;
import Rooms.Bedroom;
import Rooms.ConferenceRoom;
import Rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    Hotel hotel;
    Bedroom bedroom1;
    Bedroom bedroom2;
    ConferenceRoom conferenceRoom1;
    ConferenceRoom conferenceRoom2;
    ArrayList<Bedroom> bedrooms;
    ArrayList<ConferenceRoom> conferenceRooms;


    @Before
    public void before(){
        bedroom1 = new Bedroom(2, 44, RoomType.DOUBLE);
        bedroom2 = new Bedroom(3, 77, RoomType.TRIPLE);
        conferenceRoom1 = new ConferenceRoom(100, "Peppermint");
        conferenceRoom2 = new ConferenceRoom(120, "Spearmint");
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
        assertEquals(2, hotel.getBedrooms());
    }

    @Test
    public void hasConferenceRooms(){
        assertEquals(2, hotel.getConferenceRooms());
    }

//    @Test
//    public void checkInGuests(){
//        hotel.checkInGuest(guest, room);
//        assertEquals(1, hotel.bed)
//    }

}
