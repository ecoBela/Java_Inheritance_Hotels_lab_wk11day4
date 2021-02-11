package Hotels;

import Rooms.Bedroom;

public class Booking {
    private int noOfNights;
    private Bedroom bedroom;

    public Booking(int noOfNights, Bedroom bedroom){
        this.noOfNights = noOfNights;
        this.bedroom = bedroom;
    }

    public int getNoOfNights() {
        return noOfNights;
    }

    public Bedroom getBedroom() {
        return bedroom;
    }
}
