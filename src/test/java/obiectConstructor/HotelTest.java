package obiectConstructor;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.ArrayList;

public class HotelTest {

    @Test

    public void hotelTest() {
        Hotel Astoria = new Hotel("Astoria", "Aleea Nucului", "Oradea", "Romania",3,
                new ArrayList<>(Arrays.asList("Aer conditionat", "Loc de parcare", "Wi-Fi"))
        );

        Astoria.prezentareHotel();
        System.out.println();
    }

    public static void main(String[] args) {
        new HotelTest().hotelTest();
    }
}
