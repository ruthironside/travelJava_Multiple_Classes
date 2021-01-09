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





}
