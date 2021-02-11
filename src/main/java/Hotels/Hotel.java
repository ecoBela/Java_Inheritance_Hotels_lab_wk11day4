package Hotels;

import People.Guest;
import Rooms.Bedroom;
import Rooms.ConferenceRoom;
import Rooms.DiningRoom;

import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private HashMap<String, DiningRoom> diningRooms;

    public Hotel(ArrayList<Bedroom> bedrooms, ArrayList<ConferenceRoom> conferenceRooms){
        this.bedrooms = bedrooms;
        this.conferenceRooms = conferenceRooms;
        this.diningRooms = new HashMap<String, DiningRoom>();
    }

    public ArrayList<Bedroom> getBedrooms() {
        return bedrooms;
    }

    public ArrayList<ConferenceRoom> getConferenceRooms() {
        return conferenceRooms;
    }

    public void addGuest(Guest guest){
        Bedroom roomAddto = this.bedrooms.get(0);
        roomAddto.addGuest(guest);
    }

    public void removeGuest(Guest guest) {
        Bedroom roomToExit = this.bedrooms.get(0);
        roomToExit.removeGuest(guest);
    }

    public Booking bookRoom(Bedroom bedroom, int noOfNights) {
        Booking booking = new Booking(noOfNights, bedroom);
        return booking;
    }

    public double calculateBill(Booking booking) {
        double rate = booking.getBedroom().getRate();
        int nights = booking.getNoOfNights();
        return rate * nights;
    }

    public int getDiningRooms() {
        return diningRooms.size();
    }

    public void addDiningRoom(DiningRoom diningRoom){
        String name = diningRoom.getName();
        this.diningRooms.put(name, diningRoom);
    }
}
