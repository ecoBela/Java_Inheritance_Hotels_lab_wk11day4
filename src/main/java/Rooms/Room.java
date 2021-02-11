package Rooms;

import People.Guest;

import java.util.ArrayList;

public abstract class Room {
    private int capacity;
    private ArrayList<Guest> guests;

    public Room(int capacity){
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
    }

    public int getCapacity() {
        return capacity;
    }

    public int getGuests() {
        return guests.size();
    }

    public void addGuest(Guest guest) {
        this.guests.add(guest);
    }
}
