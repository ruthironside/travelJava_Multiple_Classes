import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengers;
    private PlaneType plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(PlaneType planeType, String flightNumber, String destination, String departureAirport, String departureTime) {
        this.passengers = new ArrayList<Passenger>();
        this.plane = planeType;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public PlaneType getType() {
        return plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public int getCapacityFromPlaneType() {
        return this.plane.getCapacity();
    }

    public void canBookAPassenger(Passenger passenger1) {
        if (getCapacityFromPlaneType() > currentCapacity()) {
            this.passengers.add(passenger1);
        }
    }

    private int currentCapacity() {
        return this.passengers.size();
    }

}
