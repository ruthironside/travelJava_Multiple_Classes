import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight1;
    Plane concordPlane;
    Plane jumboPlane;
    Plane boeingPlane;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;

    @Before
    public void setUp() {
        flight1 = new Flight(PlaneType.CONCORD, "FR756", "EDI", "GLA", "12.00" );
        concordPlane = new Plane(PlaneType.CONCORD);
        jumboPlane = new Plane(PlaneType.JUMBO);
        boeingPlane = new Plane(PlaneType.BOEING747);
        passenger1 = new Passenger("Hulk", 6);
        passenger2 = new Passenger("Thor", 2);
        passenger3 = new Passenger("Batman", 3);
    }

    @Test
    public void returnTheNumberOfSeatsOnConcord() {
        assertEquals(2, flight1.getCapacityFromPlane());
    }

    @Test
    public void passengerListSizeStartsAt0() {
        assertEquals(0, flight1.passengerListSize());
    }


    @Test
    public void canBookAPassenger_underCapacity() {
        flight1.canBookAPassenger(passenger1);
        assertEquals(1, flight1.passengerListSize());
    }

    @Test
    public void cantBookAPassenger_overCapacity() {
        flight1.canBookAPassenger(passenger1);
        flight1.canBookAPassenger(passenger2);
        flight1.canBookAPassenger(passenger3);
        assertEquals(2, flight1.passengerListSize());
    }


    @Test
    public void getAllPassengerBags() {
        flight1.canBookAPassenger(passenger1);
        flight1.canBookAPassenger(passenger2);
        assertEquals(8, flight1.getAllPassengerBags());

    }
}
