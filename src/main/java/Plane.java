import java.util.ArrayList;

public class Plane {

    private PlaneType plane;
    private ArrayList<Passenger> passengers;

    public Plane(PlaneType plane) {
        this.plane = plane;
    }

    public PlaneType getPlane() {
        return this.plane;
    }

    public int getCapacityFromPlaneType() {
        return this.plane.getCapacity();
    }

}
