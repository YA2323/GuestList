package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GuestListTest {

    @Test
    void shouldBeEmptyInitally(){

        //given
        GuestList guests = new GuestList();

        //when
         guests.setGuests(Collections.emptyList());
         int actual = guests.getGuests().size();

        //then
        Assertions.assertEquals(0,actual);
    }

    @Test
    void shouldReadSameGuestsAsWrittenBefore(){

        //given
        GuestList guests = new GuestList();
        //when

        guests.setGuests((List.of("Karl","Ute")));

        System.out.println(guests);
        String actual = guests.getGuests().toString();
        //then

        Assertions.assertEquals("[Karl, Ute]",actual);

    }

    @Test
    void


}
