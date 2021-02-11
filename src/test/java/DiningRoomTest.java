import Rooms.DiningRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {
    DiningRoom diningRoom;

    @Before
    public void before(){
        diningRoom = new DiningRoom(70, "Bedford Room", 12);
    }

    @Test
    public void hasCapacity(){
        assertEquals(70, diningRoom.getCapacity());
    }

    @Test
    public void hasGuests(){
        assertEquals(0, diningRoom.getGuests());
    }

    @Test
    public void hasName(){
        assertEquals("Bedford Room", diningRoom.getName());
    }
}
