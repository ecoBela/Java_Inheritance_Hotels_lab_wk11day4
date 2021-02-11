package Rooms;

import People.Guest;

import java.util.ArrayList;

public abstract class Room {
    private int capacity;
    private ArrayList<Guest> guests;
    private double rate;

    public Room(int capacity, double rate){
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
        this.rate = rate;
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

    public void removeGuest(Guest guest){
        this.guests.remove(guest);
    };

    public double getRate() {
        return rate;
    }
}
