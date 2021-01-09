import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    private FlightManager flightManager;
    private Plane plane;
    private Flight flight;
    Passenger passenger1;
    Passenger passenger2;

    @Before
    public void setUp(){
        this.plane = new Plane(PlaneType.CONCORD);
        this.flight = new Flight(PlaneType.CONCORD, "FR756", "EDI", "GLA", "12.00" );
        passenger1 = new Passenger("Hulk", 6);
        passenger2 = new Passenger("Thor", 2);
        this.flightManager = new FlightManager();
    }

    @Test
    public void getBagWeightPerPassenger() {
        assertEquals(37, flightManager.getBagWeightPerPassenger(flight), 0.01);
    }

//    @Test
//    public void getBagWeightTotal () {
//        flight.canBookAPassenger(passenger1);
//        assertEquals(300, flightManager.getBagWeightTotal(flight), 0.01);
//    }
}
