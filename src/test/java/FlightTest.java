import org.junit.Before;
import org.junit.Test;

public class FlightTest {

    Plane concordPlane;
    Plane jumboPlane;
    Plane boeingPlane;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;

    @Before
    public void setUp() {
        concordPlane = new Plane(PlaneType.CONCORD);
        jumboPlane = new Plane(PlaneType.JUMBO);
        boeingPlane = new Plane(PlaneType.BOEING747);
        passenger1 = new Passenger("Hulk", 6);
        passenger2 = new Passenger("Thor", 2);
        passenger3 = new Passenger("Batman", 3);

    }

    @Test
}
