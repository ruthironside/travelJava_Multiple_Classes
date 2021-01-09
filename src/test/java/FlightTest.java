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
        assertEquals(50, concordPlane.getCapacityFromPlaneType());
    }

    @Test
    public void returnTheNumberOfSeatsOnJumbo() {
        assertEquals(200, jumboPlane.getCapacityFromPlaneType());
    }

    @Test
    public void returnTheNumberOfSeatsOnBoeing() {
        assertEquals(100, boeingPlane.getCapacityFromPlaneType());
    }


    @Test
    public void canBookAPassenger_underCapacity() {
        flight1.canBookAPassenger(passenger1);
        assertEquals(50, concordPlane.getCapacityFromPlaneType());
    }


}
