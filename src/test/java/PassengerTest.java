import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;

    @Before
    public void setUp() {
        passenger1 = new Passenger("Hulk", 6);
        passenger2 = new Passenger("Thor", 2);
        passenger3 = new Passenger("Batman", 3);
    }

    @Test
    public void passengerHasName() {
        assertEquals("Hulk", passenger1.getName());
    }

    @Test
    public void passengerHasBags() {
        assertEquals(2, passenger2.getNumberOfBags());
    }

}
