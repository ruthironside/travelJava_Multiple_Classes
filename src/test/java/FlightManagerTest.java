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
        assertEquals(250, flightManager.getBagWeightPerPassenger(flight), 0.01);
    }

    @Test
    public void getBagWeightTotal () {
        flight.canBookAPassenger(passenger1);
        assertEquals(1500, flightManager.getBagWeightTotal(flight), 0.01);
    }

    @Test
    public void getWeightRemainingOnFlight () {
        flight.canBookAPassenger(passenger1);
        assertEquals(-1000, flightManager.weightRemainingOnFlight(flight), 0.01);
    }
}
