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


}
