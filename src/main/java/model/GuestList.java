package model;

import java.util.ArrayList;
import java.util.List;

public class GuestList {

    List<String> guests = new ArrayList<>();

    public List<String> getGuests() {
        return guests;
    }

    @Override
    public String toString() {
        return "GuestList{" +
                "guests=" + guests +
                '}';
    }

    public void setGuests(List<String> guests) {
        this.guests = guests;
    }
}
