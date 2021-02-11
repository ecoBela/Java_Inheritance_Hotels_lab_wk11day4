package Buildings;

import Rooms.Bedroom;
import Rooms.ConferenceRoom;

import java.util.ArrayList;

public class Hotel {
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(ArrayList<Bedroom> bedrooms, ArrayList<ConferenceRoom> conferenceRooms){
        this.bedrooms = bedrooms;
        this.conferenceRooms = conferenceRooms;
    }

    public int getBedrooms() {
        return bedrooms.size();
    }

    public int getConferenceRooms() {
        return conferenceRooms.size();
    }
}
