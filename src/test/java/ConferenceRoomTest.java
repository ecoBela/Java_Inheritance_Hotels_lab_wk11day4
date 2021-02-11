import Rooms.ConferenceRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {
    ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom(100, "Bubbles");
    }

    @Test
    public void hasCapacity(){
        assertEquals(100, conferenceRoom.getCapacity());
    }

    @Test
    public void hasGuests(){
        assertEquals(0, conferenceRoom.getGuests());
    }

    @Test
    public void hasName(){
        assertEquals("Bubbles", conferenceRoom.getName());
    }
}
