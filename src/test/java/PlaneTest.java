import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void setUp() {
        plane = new Plane(PlaneType.CONCORD);
    }

    @Test
    public void canGetPlaneType() {
        assertEquals(PlaneType.CONCORD, plane.getPlane());
    }

    @Test
    public void concordHasCapacity() {
        assertEquals(50, plane.getCapacityFromPlaneType());
    }

    @Test
    public void concordHasTotalWeight() {
        assertEquals(1500000, plane.getTotalWeightFromPlaneType());
    }

}
