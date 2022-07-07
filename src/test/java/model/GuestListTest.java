package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
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
    void shouldWriteToFileSystem(){
        //given
        GuestList guests = new GuestList();
        //when
        guests.setGuests((List.of("Theodor","Anette")));
        Path path = Path.of("guests.txt");
        System.out.println(path);
        boolean actual = false;
        try {
            String file =  Files.readString(path);
            System.out.println(file);
             actual = file.contains("Theodor")&& file.contains("Anette");
            System.out.println(actual);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        Assertions.assertTrue(actual);


      /*  File file = new File("/Users/yacinalkaissouni/Desktop/java-basics/GuestList/lib/guests.txt");
        boolean x = file.exists();
        System.out.println(x);
        if(x){
            FileInputStream fileInputStream = null;
            try {
                fileInputStream = new FileInputStream(file);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            System.out.println(fileInputStream);
        }

       */
        //then

        // /Users/yacinalkaissouni/Desktop/java-basics/GuestList/lib/guests.txt

    }


}
