public class Plane {

    private PlaneType plane;

    public Plane(PlaneType plane) {
        this.plane = plane;
    }

    public PlaneType getPlane() {
        return this.plane;
    }

    public int getCapacityFromPlaneType() {
        return this.plane.getCapacity();
    }

    public int getTotalWeightFromPlaneType() {
        return this.plane.getTotalWeight();
    }
}
