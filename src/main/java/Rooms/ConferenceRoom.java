package Rooms;

public class ConferenceRoom extends Room{
    private String name;

    public ConferenceRoom(int capacity, String name, double rate){
        super(capacity, rate);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
