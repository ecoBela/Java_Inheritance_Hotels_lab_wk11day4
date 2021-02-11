import People.Guest;
import Rooms.Bedroom;
import Rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    Bedroom bedroom;
    Guest guest;

    @Before
    public void before(){
        bedroom = new Bedroom(2, 33, RoomType.DOUBLE);
        guest = new Guest("Britney");
    }

    @Test
    public void hasCapacity(){
        assertEquals(2, bedroom.getCapacity());
    }
    @Test
    public void hasGuests(){
        assertEquals(0, bedroom.getGuests());
    }

    @Test
    public void hasRoomNumber(){
        assertEquals(33, bedroom.getRoomNumber());
    }

    @Test
    public void hasRoomType(){
        assertEquals(RoomType.DOUBLE, bedroom.getRoomType());
    }

    @Test
    public void addGuest(){
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.getGuests());
    }

}
